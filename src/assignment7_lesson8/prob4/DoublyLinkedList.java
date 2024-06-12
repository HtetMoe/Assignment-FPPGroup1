package assignment7_lesson8.prob4;


public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node();
        header.previous = header;
        header.next = header;
    }
    //1. adds to the end of the list
    public void addLast(String item){
        //implement
        if(item == null){
            return;
        }
        Node newNode = new Node();
        newNode.value = item;
        newNode.next = null;
        // previous of header connect to the last one
        // both previous and next of header point to header itself if the linklist is empty
        if(header.previous == header){
            //first element
            newNode.previous = header;
            header.next = newNode;
        }
        else {
            //last element in a non-empty linklist
            //next of last node connect to the newNode
            header.previous.next = newNode;
            //the previous of newNode connect to the second last node
            newNode.previous = header.previous;
        }
        //previous of the header point to the last one
        header.previous = newNode;
        //the next of the last node point to the header
        newNode.next = header;

    }
    // 2. Remove by passing object
    public boolean remove(String item){
        //Implement
        if(item == null || header.next == header){
            return false;
        }
        //start from the 1st node of the linklist
        Node currentNode = header.next;
        while(currentNode != header){
            if(currentNode.value.equals(item)){
                // find node
                // because the non-empty double link list is a circle - last node connect to the header
                // in this loop, there is no need to check if the next of a node is NULL

                //previous node point to the next node
                currentNode.previous.next = currentNode.next;
                //next node connect to the previous node
                currentNode.next.previous = currentNode.previous;
                //remove and reset current node
                currentNode.next = null;
                currentNode.previous = null;
                currentNode.value = null;
                return true;
            }
            currentNode = currentNode.next;
        }
        //empty link list or element is not in the list
        return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        // Implement
        if(header.previous == header){
            return false;
        }
        Node currentNode = header.next;
        header.next = currentNode.next;
        currentNode.next.previous = header;
        currentNode.previous = null;
        currentNode.value = null;
        currentNode.next = null;
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {

        // Implement
        if(header.previous == header){
            System.out.println("[NULL]");
            return;
        }
        Node currentNode = header.previous;
        while(currentNode != header){
            System.out.print(currentNode.value+" ");
            System.out.print("-> ");
            currentNode = currentNode.previous;
        }
        System.out.println("Header");
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n.next == header){
            sb.append(" " + n.value);
            return;
        }
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.printReverse();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        list.addLast("Jack");
        list.addLast("Jones");
        System.out.println(list);
        list.printReverse();
        list.removeFirst();
        list.printReverse();
        System.out.println("Try to remove john: " + list.remove("john"));
        System.out.println("Try to remove Steve: " + list.remove("Steve"));
        list.printReverse();
        System.out.println(list);

        // Call all your implemented Methods
    }
}