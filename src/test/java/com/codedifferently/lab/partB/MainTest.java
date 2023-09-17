package com.codedifferently.lab.partB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Borrower borrower1;
    private Borrower borrower2;

    @BeforeEach
    public void setUp() {
        library = new Library();

        Author author1 = new Author("J.K. Rowling", 55, "Famous for the Harry Potter series.");
        Author author2 = new Author("Isaac Asimov", 72, "Known for science fiction novels.");

        book1 = new Book("Harry Potter and the Philosopher's Stone", BookGenre.FICTION, author1);
        book2 = new Book("Foundation", BookGenre.SCIENCE_FICTION, author2);

        library.addBook(book1);
        library.addBook(book2);

        borrower1 = new Borrower("Alice", 28, "123 Main St.", "alice@email.com");
        borrower2 = new Borrower("Bob", 34, "456 Elm St.", "bob@email.com");

        library.addBorrower(borrower1);
        library.addBorrower(borrower2);
    }

    @Test
    public void testBorrowingBook() {
        assertTrue(borrower1.borrow(book1));
        assertEquals(BookStatus.BORROWED, book1.getStatus()); // Assuming BookStatus.BORROWED is an enum value for borrowed books
    }


    @Test
    public void testReturningBook() {
        borrower1.borrow(book1);
        assertTrue(borrower1.returnBook(book1));
        assertEquals(BookStatus.AVAILABLE, book1.getStatus());
    }
}
