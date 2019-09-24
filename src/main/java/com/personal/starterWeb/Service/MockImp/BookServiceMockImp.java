package com.personal.starterWeb.Service.MockImp;

import com.personal.starterWeb.Bean.Book;
import com.personal.starterWeb.Dao.BookDao;
import com.personal.starterWeb.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceMockImp implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookDao.getBooks();
    }

    @Override
    public Book getBookById(int id) {
        return bookDao.getBookById(id);
    }

    @Override
    public void removeBook(int id) {
        bookDao.removeBook(id);
    }

    @Override
    public Book updateBook(int id, Book book) {
        return bookDao.updateBook(id, book);
    }
}
