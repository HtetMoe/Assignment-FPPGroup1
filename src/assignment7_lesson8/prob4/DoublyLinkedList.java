package assignment7_lesson8.prob4;


public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node();
    }
    //1. adds to the end of the list
    public void addLast(String item){
        //implement
        if (item == null)
            //do nothing if item is null
            return;

        Node newNode = new Node();
        newNode.value = item;
        // newNode would add at last, so the next of newNode always point to the null
        newNode.next = null;

        Node c = header;
        while(null != c.next){
            // find the last node
            c = c.next;
        }
        c.next = newNode;
        newNode.previous = c;


    }
    // 2. Remove by passing object
    public boolean remove(String item){
        //Implement
        if (item == null)
            return false;

        Node c = header;
        while(null != c.next){
            c = c.next;
            if (c.value.equals(item)){
                c.value = null;
                if(c.next == null){
                    // last node case
                    c.previous.next = null;
                }
                else
                    c.next.previous = c.previous;

                c.previous.next = c.next;
                c.previous = null;
                c.next = null;
                return true;
            }
        }
        return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        // Implement
        if (header.next == null)
            return false;

        Node c = header.next;
        header.next = c.next;
        if (c.next != null)
            c.next.previous = header;
        c.next = null;
        c.previous = null;
        c.value = null;
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {
        // Implement
        if (header.next == null){
            System.out.println("[NULL]");
            return;
        }
        Node c = header.next;
        while(null != c.next){
            c = c.next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(c != header){
            sb.append(c.value + " ");
            c = c.previous;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
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
        System.out.println("Try to remove first " + list.removeFirst());
        System.out.println(list);

        // Call all your implemented Methods
    }
}

