package assignment8.problem1;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(33);
        //System.out.println("rear: " + myQueue.rear + "lenght: " + myQueue.size());
        myQueue.enQueue(20);
        myQueue.enQueue(11);
        myQueue.enQueue(2222);
        myQueue.enQueue(0);

        System.out.println("first element is " + myQueue.peek());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println("first element is " + myQueue.peek());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println("rear is " + myQueue.rear + " front is " + myQueue.front);
        System.out.println("first element is " + myQueue.peek());

    }
}
