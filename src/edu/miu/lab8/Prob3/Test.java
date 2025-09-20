package edu.miu.lab8.Prob3;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();

        // Add Three book with unique ISBN
        library.addBook("978-0134685991", "Effective Java", "Joshua Bloch");
        library.addBook("978-0596009205", "Head First Java", "Kathy Sierra, Bert Bates");
        library.addBook("978-1617294945", "Java Concurrency in Practice", "Brian Goetz");
        System.out.println();
        // Duplicate ISBN
        library.addBook("978-1617294945", "Java Concurrency in Practice", "Brian Goetz");
        System.out.println();

        // Borrow the book
        library.borrowBook("978-0596009205");
        // Borrow the book that is already borrowed.
        library.borrowBook("978-0596009205");
        // Borrow the book that doesn't exist
        library.borrowBook("978-0596009222");
        System.out.println();

        // Check if the book is borrowed.
        library.isBookBorrowed("978-0596009205");
        // check if borrowed or not which is not borrowed yet.
        library.isBookBorrowed("978-0134685991");
        System.out.println();

        // Get the book details
        library.getBookDetails("978-0134685991");
        System.out.println();

        // list all the books
        library.listAllBooks();
        System.out.println();

        // list all the borrowed books
        library.listBorrowedBooks();
        System.out.println();

        library.returnBook("978-0596009205");
    }
}
