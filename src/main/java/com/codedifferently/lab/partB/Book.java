package com.codedifferently.lab.partB;

import java.util.ArrayList;

public class Book {
    private static int bookCount = 0;
    private int id;
    private String title;
    private BookStatus status;
    private BookGenre genre;
    private Author author;

    public Book(String title, BookGenre genre, Author author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.status = BookStatus.AVAILABLE;
        this.id = ++bookCount;
    }
    private static ArrayList<Book> allBooks = new ArrayList<>();
    public static ArrayList<Book> search(String title) {
        ArrayList<Book> matchingBooks = new ArrayList<>();
        for (Book book : allBooks) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }


    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", status=" + status + ", genre=" + genre + ", author=" + author + "]";
    }

    public String getTitle() {
        return this.title;
    }

    public BookStatus getStatus() {
        return this.status;
    }

    public void setStatus(BookStatus bookStatus) {
        this.status = bookStatus;
    }
}
