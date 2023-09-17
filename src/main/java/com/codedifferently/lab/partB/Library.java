package com.codedifferently.lab.partB;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Borrower> borrowers;

    public Library() {
        this.books = new ArrayList<>();
        this.borrowers = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean removeBook(Book book) {
        return this.books.remove(book);
    }

    public void addBorrower(Borrower borrower) {
        this.borrowers.add(borrower);
    }



    @Override
    public String toString() {
        return "Library [books=" + books + ", borrowers=" + borrowers + "]";
    }
}
