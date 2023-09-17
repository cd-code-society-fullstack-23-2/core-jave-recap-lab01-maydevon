package com.codedifferently.lab.partB;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Author author1 = new Author("J.K. Rowling", 55, "Famous for the Harry Potter series.");
        Author author2 = new Author("Isaac Asimov", 72, "Known for science fiction novels.");

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", BookGenre.FICTION, author1);
        Book book2 = new Book("Foundation", BookGenre.SCIENCE_FICTION, author2);

        library.addBook(book1);
        library.addBook(book2);

        Borrower borrower1 = new Borrower("Alice", 28, "123 Main St.", "alice@email.com");
        Borrower borrower2 = new Borrower("Bob", 34, "456 Elm St.", "bob@email.com");

        library.addBorrower(borrower1);
        library.addBorrower(borrower2);

        System.out.println("Borrowing book:");
        if (borrower1.borrow(book1)) {
            System.out.println(borrower1.getName() + " successfully borrowed " + book1.getTitle());
        } else {
            System.out.println("Book not available for borrowing.");
        }

        System.out.println("\nSearching for 'Harry Potter':");
        for (Book book : Book.search("Harry Potter")) {
            System.out.println(book);
        }

        System.out.println("\nReturning book:");
        if (borrower1.returnBook(book1)) {
            System.out.println(borrower1.getName() + " returned " + book1.getTitle());
        } else {
            System.out.println("Error in returning the book.");
        }

        System.out.println("\nStatus of " + book1.getTitle() + ": " + book1.getStatus());
    }
}
