package com.personal.starterWeb.Bean;

public class Author extends Person {
    Book lastBook;

    public Author(String name, int id) {
        super(name, id);
    }

    public Book getLastBook() {
        return lastBook;
    }

    public void setLastBook(Book lastBook) {
        this.lastBook = lastBook;
    }
}
