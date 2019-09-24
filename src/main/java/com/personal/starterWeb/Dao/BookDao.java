package com.personal.starterWeb.Dao;

import com.personal.starterWeb.Bean.Book;

import java.util.List;

public interface BookDao {
    public void addBook(Book book);
    public List<Book> getBooks();
    public Book getBookById(int id);
    public void removeBook(int id);
    public Book updateBook(int id, Book book);

}
