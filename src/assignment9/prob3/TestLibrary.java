package assignment9.prob3;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        /*
        Book b1 = new Book("978-3-16-148410-0", "The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book("978-0-7432-7356-5", "To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book("978-0-452-28423-4", "1984", "George Orwell");
        Book b4 = new Book("978-0-14-028329-7", "Pride and Prejudice", "Jane Austen");
        Book b5 = new Book("978-0-307-28096-5", "The Catcher in the Rye", "J.D. Salinger");
        Book b6 = new Book("978-0-15-601219-5", "The Road", "Cormac McCarthy");
        Book b7 = new Book("978-1-5011-2637-5", "The Nightingale", "Kristin Hannah");
        Book b8 = new Book("978-0-06-112241-5", "The Book Thief", "Markus Zusak");
        Book b9 = new Book("978-0-399-59050-4", "The Handmaid's Tale", "Margaret Atwood");
        Book b10 = new Book("978-0-7432-7357-2", "Life of Pi", "Yann Martel");
*/
        library.addBook("978-3-16-148410-0", "The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("978-0-7432-7356-5", "To Kill a Mockingbird", "Harper Lee");
        library.addBook("978-0-452-28423-4", "1984", "George Orwell");
        library.addBook("978-0-14-028329-7", "Pride and Prejudice", "Jane Austen");
        library.addBook("978-0-307-28096-5", "The Catcher in the Rye", "J.D. Salinger");
        library.addBook("978-0-15-601219-5", "The Road", "Cormac McCarthy");
        library.addBook("978-1-5011-2637-5", "The Nightingale", "Kristin Hannah");
        library.addBook("978-0-06-112241-5", "The Book Thief", "Markus Zusak");
        library.addBook("978-0-399-59050-4", "The Handmaid's Tale", "Margaret Atwood");
        library.addBook("978-0-7432-7357-2", "Life of Pi", "Yann Martel");

        library.borrowBook("978-3-16-148410-0");
        library.borrowBook("978-3-16-148410-12");
        library.borrowBook("978-0-452-28423-444");
        library.borrowBook("978-3-16-148410-3");
        library.borrowBook("978-0-06-112241-5");
        library.borrowBook("978-0-7432-7357-2");

        library.returnBook("978-3-16-148410-0");
        library.returnBook("978-3-16-148410-1");
        library.returnBook("978-0-452-28423-4");
        library.returnBook("978-3-16-148410-3");
        library.returnBook("978-0-7432-7357-2");

        library.getBookDetails("978-0-452-28423-4");
        library.getBookDetails("978-3-16-148410-311");
        library.getBookDetails("978-0-06-112241-522");
        library.getBookDetails("978-0-7432-7357-2");


        library.listAllBooks();

        library.borrowBook("978-3-16-148410-0");
        library.borrowBook("978-3-16-148410-12");
        library.borrowBook("978-0-452-28423-444");
        library.borrowBook("978-3-16-148410-3");
        library.borrowBook("978-0-06-112241-5");
        library.borrowBook("978-0-7432-7357-2");

        library.listBorrowedBooks();


    }
}
