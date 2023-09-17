package com.codedifferently.lab.partB;

public class Author extends Person{
    private static int authorCount = 0;
    private int authorID;
    private String biography;

    public Author(String name, Integer age, String biography) {
        super(name, age);
        this.biography = biography;
        this.authorID = ++authorCount;
    }

    public void writeBook() {
        // Implementation
    }

    public void updateBio(String newBio) {
        this.biography = newBio;
    }

    @Override
    public String toString() {
        return super.toString() + " Author [authorID=" + authorID + ", biography=" + biography + "]";
    }
}
