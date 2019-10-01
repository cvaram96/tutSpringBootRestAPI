package com.personal.starterWeb.Controller;

import com.personal.starterWeb.Bean.Book;
import com.personal.starterWeb.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> addBook(@RequestBody Book book){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.addBook(book));
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getBooks());
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") int id){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getBookById(id));
    }
    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> removeBook(@PathVariable("id") int id){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.removeBook(id));
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") int id, @RequestBody Book book){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.updateBook(id, book));
    }

}
