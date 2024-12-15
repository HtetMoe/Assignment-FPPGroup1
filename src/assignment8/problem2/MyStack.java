package assignment8.problem2;

import assignment7_lesson8.prob4.DoublyLinkedList;

public class MyStack {
    /* Assumption: the stack will never become full */
    private int size;
    private class MyNode{
        Integer data;
        MyNode next;
        MyNode prev;
    }
    private MyNode header;
    private MyNode top;
    public MyStack() {
        header = new MyNode();
        top = null;
        size = 0;
    }

    public void push(Integer x) {
        MyNode newNode = new MyNode();
        newNode.data = x;

        if (header.next == null) {
            header.next = newNode;
            newNode.prev = header;
            newNode.next = null;
        } else
        {
            header.next.prev = newNode;
            newNode.next = header.next;
            header.next = newNode;
        }
        top = newNode;
        size++;
    }

    public Integer peek() {
        //returns null if stack is empty
        return (top == null) ? null : top.data;
    }
    public Integer pop() {
        Integer ret = peek();
        if(ret != null) {
            ret = top.data;
            header.next = top.next;
            if (top.next != null)
                top.next.prev = header;
            top.next = null;
            top.prev = null;
            top.data = null;
            top = header.next;
            size--;
        }
        return ret;
    }
    public boolean isEmpty(){ // true if stack is empty
        return (top == null);
    }

    public int size(){ // returns number of items in the stack
        return size;
    }
    @Override
    /*
    public String toString() {
        if(top == null) return "<empty>";
        StringBuilder sb = new StringBuilder();
        for(Integer x : arr) {
            if(x != null)
                sb.append(x.toString()).append(" ");
        }
        return sb.toString();
    }
    */
    public String toString(){
        if(top == null) return "<empty>";
        StringBuilder sb = new StringBuilder();
        MyNode c = header;
        while(c != null){
            sb.append(c.data).append(" ");
            c = c.next;
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println(STR."Size = \{st.size()}");
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}

