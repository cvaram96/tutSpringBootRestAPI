package com.personal.starterWeb.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    int id;
    String title;
    Boolean statusBook;
    Author author;


    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Boolean getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(Boolean statusBook) {
        this.statusBook = statusBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", statusBook=" + statusBook +
                ", author=" + author +
                '}';
    }
}
