package assignment7_lesson8.prob1;

import java.util.Arrays;
/*
    User Defined Array
    - add
    - remove
    - find
    - get
 */

// Common task : Make sure to check your code should not throw any run time exception
public class MyPersonList {
    private final int INITIAL_LENGTH = 3;
    private Person[] personArray;
    private int size; // actual array size

    //Default Constructor
    public MyPersonList() {
        personArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // 1. Implement method to Add as last element, make sure you have enough room else call resize()
    public void add(Person p) {
        if(p == null) return;

        if(size == personArray.length) // if full, resize
            resize();

        personArray[size] = p;
        size++; // update
    }

    // 2. get person information by passing index
    public Person get(int i) {
        if (i < 0 || i > size - 1)
            return null; // throw new IndexOutOfBoundsException("Invalid index i" + i);
        return personArray[i];
    }

    // 3. Find the Person object using lastname
    public boolean find(String lastName) {
        if (lastName == null) return false;
        for(Person p : personArray){
            if(lastName.equals(p.getLast()))
                return true;
        }
        return false; // The element is not in the list
    }

    // 4. Remove the person object by passing its lastname
    public boolean remove(String lastName) {
        if (size == 0) return false; // the list is empty
        if (lastName == null) return false;

        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (personArray[i].getLast().equals(lastName)) {
                index = i;
                break;
            }
        }

        if (index == -1) return false; // person with this lastName is not found in the list
        Person[] temp = new Person[personArray.length];
        System.arraycopy(personArray, 0, temp, 0, index);
        System.arraycopy(personArray, index + 1, temp, index, personArray.length - (index + 1));
        personArray = temp;
        --size;
        return true;
    }

    // 5. Resizing the list
    private void resize() {
        System.out.println("do resize.");

        int newLength = personArray.length * 2; //double the size
        personArray = Arrays.copyOf(personArray, newLength);
        System.out.println("After resize -> " + Arrays.toString(personArray));
    }

    // To display all the persons list
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(personArray[i] + ", ");
        }
        sb.append(personArray[size - 1] + "]");
        return sb.toString();
    }

    public int size() {// Return the size
        return size;
    }

    //MAIN METHOD
    public static void main(String[] args) {
        MyPersonList list = new MyPersonList();
        System.out.println("default size : " + list.personArray.length);

        list.add(new Person("Bruce", "Tom", 36));
        list.add(new Person("Paul", "Corozza", 51));
        list.add(new Person("Joe", "Lermon", 53));
        list.add(new Person("Anne", "Dow", 55));

        System.out.println("\nsize(), after resize : " + list.size() + "\n" + list);
        list.remove("Anne");

        System.out.println("\nsize(), after remove one : " + list.size() + "\n" + list);
        System.out.println("\n searching of Joe : " + list.find("Joe"));
        System.out.println(" get index 2 : " + list.get(2));
    }
}