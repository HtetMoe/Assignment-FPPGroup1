package assignment9.Prob3;

public class TestClass {
    public static void main(String[] args) {
        Library library = new Library();

        //add book
        Book book1 = new Book("111", "Book1", "Author1");
        Book book2 = new Book("222", "Book2", "Author2");
        Book book3 = new Book("333", "Book3", "Author3");
        Book book4 = new Book("444", "Book4", "Author4");
        Book book5 = new Book("555", "Book5", "Author5");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println(library.listAllBooks());

        String key1 = "111";
        String key2 = "222";
        String key3 = "LLL";

        //borrow
        System.out.println();
        library.borrowBook(key3); //Book not found!

        library.borrowBook(key1);
        library.borrowBook(key2);
        System.out.println(library.getBookDetails(key1)); //is borrowed = true
        System.out.println();

        //borrow again
        library.borrowBook(key1); //already borrowed
        System.out.println();

        //borrowed list
        System.out.println(library.listBorrowedBooks());
        System.out.println();

        //all list
        System.out.println(library.listAllBooks());
    }
}
