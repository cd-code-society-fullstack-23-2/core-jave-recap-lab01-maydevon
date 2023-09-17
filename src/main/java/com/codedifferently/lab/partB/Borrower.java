package com.codedifferently.lab.partB;

import java.util.ArrayList;

public class Borrower extends Person{
    private static int borrowerCount = 0;
    private int id;
    private ArrayList<Book> borrowedBooks;
    private String address;
    private String email;

    public Borrower(String name, Integer age, String address, String email) {
        super(name, age);
        this.address = address;
        this.email = email;
        this.id = ++borrowerCount;
        this.borrowedBooks = new ArrayList<>();
    }

    public boolean borrow(Book book) {
        if (book.getStatus() == BookStatus.AVAILABLE) {
            book.setStatus(BookStatus.BORROWED);
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setStatus(BookStatus.AVAILABLE);
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return super.toString() + " Borrower [id=" + id + ", address=" + address + ", email=" + email + "]";
    }
}
