package com.personal.starterWeb.Controller;

import com.personal.starterWeb.Bean.Book;
import com.personal.starterWeb.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/lib")
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/books")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }
    @DeleteMapping("/books/{id}")
    public void removeBook(@PathVariable("id") int id){
        bookService.removeBook(id);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable("id") int id, @RequestBody Book book){
        return bookService.updateBook(id, book);
    }

}
