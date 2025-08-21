package Assignments;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books (using toString())
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the Library:");
            for (Book book : books) {
                System.out.println(book); // calls toString() automatically
            }
        }
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;

    // Constructor
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", ISBN: " + isbn +
               ", Price: $" + price;
    }
}

public class Asmt_1 {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("The Alchemist", "Paulo Coelho", "9780061122415", 12.99));
        library.addBook(new Book("1984", "George Orwell", "9780451524935", 9.99));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "9780132350884", 35.50));

        // Displaying books
        library.displayBooks();
    }
}
