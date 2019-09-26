package com.personal.starterWeb.Controller;

import com.personal.starterWeb.Bean.Book;
import com.personal.starterWeb.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/lib")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{userId}/lastBook")
    ResponseEntity<Book> getLastBook(@PathVariable("userId") int userId){
        Book book = userService.getLastBook(userId);
        return ResponseEntity.status(HttpStatus.OK).body(book);
    }
    @PostMapping(value = "/{userId}/borrowBook",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    ResponseEntity<String> borrowBook(@PathVariable("userId") int userId){
        String status = userService.borrowBook(userId);
        return ResponseEntity.status(HttpStatus.OK).body(status);
    }
    @PutMapping( value = "/{userId}/updateMe",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    ResponseEntity<String> updateMe(@PathVariable("userId") int userId, @RequestParam(value ="name") String name){
        String status = userService.updateMe(userId, name);
        return ResponseEntity.status(HttpStatus.OK).body(status);
    }
}
