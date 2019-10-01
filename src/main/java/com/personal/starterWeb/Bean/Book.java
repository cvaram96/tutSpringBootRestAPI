package com.personal.starterWeb.Bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    int id;
    String title;
    Boolean statusBook;


    public Book(int id, String title){
        this.id = id;
        this.title = title;
    }

    public Boolean getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(Boolean statusBook) {
        this.statusBook = statusBook;
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
                '}';
    }
}
