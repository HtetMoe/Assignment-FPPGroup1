package assignment9.prob3;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> books;
    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author){
        if (books.containsKey(ISBN)){
            System.out.println(ISBN + " exists in library");
            return;
        }
        books.put(ISBN, new Book(ISBN, title, author));
        System.out.println("Added " + ISBN + " to library");
    }
    public void borrowBook(String ISBN){
        if (!books.containsKey(ISBN)){
            System.out.println("Book " + ISBN + " not found in library");
            return;
        }
        Book book = books.get(ISBN);
        if(book.isBorrowed()){
            System.out.println("Book " + ISBN + " is already borrowed");
        }else{
            book.setBorrowed(true);
            System.out.println("Book " + ISBN + " is borrowed");
        }
    }
    public void returnBook(String ISBN){
        if (!books.containsKey(ISBN)){
            System.out.println("Book " + ISBN + " not found in library");
            return;
        }
        Book book = books.get(ISBN);
        if(book.isBorrowed()){
            book.setBorrowed(false);
            System.out.println("Book " + ISBN + " returned");
        }else{
            System.out.println("Book " + ISBN + " is not borrowed");
        }
    }
    public boolean isBookBorrowed(String ISBN){
        if (!books.containsKey(ISBN)){
            System.out.println("Book " + ISBN + " not found in library");
            return false;
        }
        return books.get(ISBN).isBorrowed();
    }

    public Book getBookDetails(String ISBN){
        if (!books.containsKey(ISBN)){
            System.out.println("Book " + ISBN + " not found in library");
            return null;
        }
        return books.get(ISBN);
    }

    public void listAllBooks(){
        books.forEach((k,v) -> System.out.println(v));
    }

    public void listBorrowedBooks(){
        books.forEach((k,v) -> {
            if (v.isBorrowed())
                System.out.println(v);
        });
    }

}
