package assignment10_ErrorHandling.problem3;

import java.util.Arrays;

public class MyQueue {
    private int[] arr = new int[3];
    private int front = -1;
    private int rear = 0;

    //isEmpty
    public boolean isEmpty() {
        return front == -1;
    }

    //get element
    public int peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is Empty!");
        }
        return arr[front];
    }

    //insert
    public void enqueue(int value){
        if(rear == arr.length) resize();

        if(front == -1) front = 0;
        arr[rear++] = value;
    }

    //resize
    public void resize(){
        System.out.println("Resizing the array.");

        int newLen = arr.length * 2;
        int[] newArr = new int[newLen];
        System.arraycopy(arr, front, newArr, 0, rear - front); //**
        arr = newArr;

        //update
        front = 0;
        rear = rear - front;
    }

    //dequeue
    public int dequeue() throws EmptyQueueException {
        if(isEmpty())
            throw new EmptyQueueException("Queue is Empty!");

        int item = arr[front];
        if(front == rear - 1){ // has one item
            front = -1;
            rear = 0;
        }
        else
            ++front;

        return item;
    }

    public int size(){
        return isEmpty() ? 0 : rear - front;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        //delete -> when empty
        try {
            System.out.println("Deleting first element -> ");
            myQueue.dequeue();
        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }

        //get first element
        try {
            System.out.println("Getting first element: " + myQueue.peek());
        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }

        // Insert elements
        System.out.println();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        System.out.println("My Queue: " + Arrays.toString(myQueue.arr));
        System.out.println();

        //size
        System.out.println("my queue size -> " + myQueue.size());
        System.out.println();

        //remove
        try {
            System.out.println("Deleting first element: " + myQueue.dequeue());
        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Queue contents after dequeue: " + Arrays.toString(myQueue.arr));
        //get first element
        try {
            System.out.println("Getting first element: " + myQueue.peek());
        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}
