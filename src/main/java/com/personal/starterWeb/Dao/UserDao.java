package com.personal.starterWeb.Dao;

import com.personal.starterWeb.Bean.Book;
import org.springframework.stereotype.Service;

@Service
public interface UserDao {
    Book getLastBook(int userId);
    String borrowBook(int userId);
    String updateMe(int userId, String name);
}
