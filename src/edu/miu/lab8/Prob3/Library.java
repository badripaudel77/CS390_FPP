package edu.miu.lab8.Prob3;

import java.util.HashMap;

public class Library {
    private final HashMap<String, Book> bookCollectionMap;

    public Library() {
        this.bookCollectionMap = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author) {
        Book newBook = new Book(ISBN, title, author);
        Book existing = bookCollectionMap.putIfAbsent(ISBN, newBook);
        if (existing != null) {
            System.out.println("Book with ISBN number " + ISBN + " already exists.");
        } else {
            System.out.println("The following book added into the library collection : " + newBook);
        }
    }

    public void borrowBook(String ISBN) {
        if (!this.bookCollectionMap.containsKey(ISBN)) {
            System.out.println("No book with given ISBN number " + ISBN + " exists in the library.");
            return;
        }
        Book book = this.bookCollectionMap.get(ISBN);
        if (book == null) {
            return;
        }

        if (book.isBorrowed()) {
            System.out.println("Given book with ISBN number " + ISBN + " currently borrowed.");
        } else {
            book.setBorrowed(true);
            System.out.println("The Book " + book + " is issued to you, thank you !");
        }
    }

    public void returnBook(String ISBN) {
        if (!this.bookCollectionMap.containsKey(ISBN)) {
            System.out.println("No book with given ISBN number " + ISBN + " exists in the library.");
            return;
        }
        Book book = this.bookCollectionMap.get(ISBN);
        if (book == null) {
            return;
        }
        if (!book.isBorrowed()) {
            System.out.println("You've not borrowed the Book with given ISBN number: " + ISBN + " !");
        } else {
            book.setBorrowed(false);
            System.out.println("You've successfully returned the book: " + book);
        }
    }

    public void isBookBorrowed(String ISBN) {
        if (!this.bookCollectionMap.containsKey(ISBN)) {
            System.out.println("No book with given ISBN number " + ISBN + " exists in the library.");
            return;
        }
        Book book = this.bookCollectionMap.get(ISBN);
        if (book == null) {
            return;
        }
        if (book.isBorrowed()) {
            System.out.println("YES, the book is borrowed.");
        } else {
            System.out.println("NO, the book is not borrowed.");
        }
    }

    public void getBookDetails(String ISBN) {
        if (!this.bookCollectionMap.containsKey(ISBN)) {
            System.out.println("No book with given ISBN number " + ISBN + " exists in the library.");
            return;
        }
        Book book = this.bookCollectionMap.get(ISBN);
        if (book == null) {
            return;
        }
        System.out.println("The details of the book is as follows : " + book);
    }

    public void listAllBooks() {
        if (bookCollectionMap.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("All the book collection in the library : ");
        bookCollectionMap.values().forEach(System.out::println);
        System.out.println("----------------------------");
    }

    public void listBorrowedBooks() {
        System.out.println("Getting all the borrowed books : ");
        for (Book book : bookCollectionMap.values()) {
            if (book != null) {
                if (book.isBorrowed()) System.out.println(book);
            }

        }

    }

}
