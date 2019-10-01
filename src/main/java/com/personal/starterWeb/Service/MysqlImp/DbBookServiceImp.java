package com.personal.starterWeb.Service.MysqlImp;

import com.personal.starterWeb.Bean.Book;
import com.personal.starterWeb.Dao.BookMysqlDao;
import com.personal.starterWeb.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResponseErrorHandler;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
public class DbBookServiceImp implements BookService {
    @Autowired
    BookMysqlDao bookMysqlDao;
    public DbBookServiceImp() {
    }

    @Override
    public String addBook(Book book) {
        bookMysqlDao.save(book);
        return  "Successfully added book";
    }

    @Override
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        bookMysqlDao.findAll().forEach(books::add);
        return books;
    }

    @Override
    public Book getBookById(int id) {
        return bookMysqlDao.findById(id).orElse(null);
    }

    @Override
    public String removeBook(int id) {
        bookMysqlDao.deleteById(id);
         return "Book succesfully removed";
    }

    @Override
    public Book updateBook(int id, Book book) {
        bookMysqlDao.save(book);
        return book;
    }
}
