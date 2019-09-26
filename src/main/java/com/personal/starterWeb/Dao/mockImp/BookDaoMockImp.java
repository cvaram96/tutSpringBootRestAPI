package com.personal.starterWeb.Dao.mockImp;

import com.personal.starterWeb.Bean.Book;
import com.personal.starterWeb.Dao.BookDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDaoMockImp implements BookDao {
    List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Book getBookById(int id) {
        Book book = books.stream().filter(b ->b.getId()==id ).findFirst().get();
        return book;
    }

    @Override
    public void removeBook(int id) {
        Book book = books.stream().filter(b ->b.getId()==id ).findFirst().get();
        books.remove(book);
    }

    @Override
    public Book updateBook(int id, Book book) {
        Book updateBook = books.stream().filter(b ->b.getId()==id ).findFirst().get();
        updateBook.setTitle(book.getTitle());
        updateBook.setId(book.getId());
        return updateBook;
    }

}
