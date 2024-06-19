package assignment10.prob3;

public class MyPersonList {
    private final int INITIAL_LENGTH = 3;
    private Person[] PersonArray;
    private int size;

    // Default Constructor
    public MyPersonList() {
        PersonArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // Add at last
    public void add(Person s) {
        try
        {
            if(s == null)
                throw new NullPointerException("can not add null person");
            if(size == PersonArray.length)
                resize();
            PersonArray[size++] = s;
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    // get person information by passing index
    public Person get(int i) {
        if(i < 0 || i >= size)
            throw new IndexOutOfBoundsException();
        return PersonArray[i];
    }

    // Find the Person object using lastname
    public boolean find(String lastName) {
        try{
            if (lastName == null)
                throw new NullPointerException("can not find null person");
            for (Person p : PersonArray) {
                if (p.getLast().equals(lastName))
                    return true;
            }
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    // Adding Person object using specific index
    public void insert(Person s, int pos) {
        try{
            if (s == null)
                throw new NullPointerException("can not insert null person");
            if (pos < 0 || pos > size)
                throw new IndexOutOfBoundsException();
            if (size == PersonArray.length)
                resize();
            Person [] tmp = new Person[PersonArray.length + INITIAL_LENGTH];
            System.arraycopy(PersonArray, 0, tmp, 0, pos);
            tmp[pos] = s;
            System.arraycopy(PersonArray, pos + 1, tmp, pos, size - pos - 1);
            PersonArray = tmp;
        }catch(NullPointerException | IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    // Remove the person object by passing its lastname
    public boolean remove(String lastName) {
        try{
            if (lastName == null)
                throw new NullPointerException("can not remove null person");
            for(int i = 0; i < size; i++){
                if (PersonArray[i].getLast().equals(lastName))
                {
                    System.arraycopy(PersonArray, i + 1, PersonArray, i, size - i - 1);
                    size--;
                    return true;
                }
            }
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    // Resizing the list
    private void resize() {
        Person[] tmp = new Person[PersonArray.length  + INITIAL_LENGTH];
        System.arraycopy(PersonArray, 0, tmp, 0, size);
        PersonArray = tmp;
    }
    // To displa all the persons list
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(PersonArray[i] + ", ");
        }
        sb.append("]");
        return sb.toString();
    }
    // Return the size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyPersonList list = new MyPersonList();
        list.add(new Person("Renuka", "Mohanraj", 36));
        list.add(new Person("Paul", "Corozza", 51));
        list.add(new Person("Joe", "Lermon", 53));
        list.add(new Person("Anne", "Dow", 55));
        System.out.println("\nSize() : " + list.size() + "\n" + list);
        list.remove("Mohanraj");
        System.out.println("\nSize() : " + list.size() + "\n" + list);
        list.insert(new Person("Arun", "Jetlie", 32), 2);
        System.out.println("\nSearching of Lermon: " + list.find("Paul"));
        System.out.println(list.get(2));
    }
}
