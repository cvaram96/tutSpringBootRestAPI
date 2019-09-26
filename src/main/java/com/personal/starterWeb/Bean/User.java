package com.personal.starterWeb.Bean;

public class User extends Person {
    Book borrowedBook;

    public User(String name, int id) {
        super(name, id);
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    @Override
    public String toString() {
        return "User{" +
                "borrowedBook=" + borrowedBook +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
