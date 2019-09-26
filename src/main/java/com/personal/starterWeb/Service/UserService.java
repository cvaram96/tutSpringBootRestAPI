package com.personal.starterWeb.Service;

import com.personal.starterWeb.Bean.Book;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Book getLastBook(int userId);
    String borrowBook(int userId);
    String updateMe(int userId, String name);
}
