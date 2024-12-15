package assignment9.Prob3;

import java.util.HashMap;
import java.util.Map;

/*
    - key : ISBN, value : Book
 */
public class Library {
    private HashMap<String, Book> books;

    //constructor
    public Library() {
        books = new HashMap<>();
    }

    //add book
    public void addBook(Book book) {
        if (book == null) return;

        String key = book.getISBN();
        books.put(key, book);
    }

    //borrow book
    public void borrowBook(String ISBN) {
        if (books.containsKey(ISBN)) {
            Book book = books.get(ISBN);

            //check already borrowed or not
            if (book.isBorrowed())
                System.out.println("Book " + book.getISBN() + " already borrowed.");
            else
                book.setBorrowed(true);

        } else {
            System.out.println("Book not found!");
        }
    }

    //a book detail
    public String getBookDetails(String ISBN) {
        if (books.containsKey(ISBN)) {
            Book book = books.get(ISBN);
            return book.toString();
        }
        else
            return "Book not found!";
    }

    //LIST BORROWED BOOKS
    public String listBorrowedBooks(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            Book book = entry.getValue();

            //only borrowed books
            if (book.isBorrowed()){
                String key = entry.getKey();
                sb.append("Key: ").append(key).append(" -> ").append(book).append("\n");
            }
        }
        return sb.toString();
    }

    //list ALL BOOKS
    public String listAllBooks() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            String key = entry.getKey();
            Book book = entry.getValue();
            sb.append("Key: ").append(key).append(" -> ").append(book).append("\n");
        }
        return sb.toString();
    }
}
