package assignment8.problem1;

public class MyQueue {
    int front;
    int rear;
    int[] arr;
    final int MYQUEUE_LENGTH = 10;
    public MyQueue() {
        front = -1;
        rear = 0;
        arr = new int[MYQUEUE_LENGTH];
    }
    public void enQueue(int value) {
        if (rear == arr.length - 1) {
            reSize();
        }
        arr[rear++] = value;
    }
    public int deQueue() {
        if (front + 1 == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[++front];
    }
    public int peek(){
        if (front + 1 == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front + 1];
    }

    public boolean isEmpty(){
        return front + 1 == rear;
    }

    public int size(){
        return rear - front + 1;
    }

    private void reSize(){
        int[] temp = new int[arr.length + MYQUEUE_LENGTH];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }
}
