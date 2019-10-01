package com.personal.starterWeb.Dao;

import com.personal.starterWeb.Bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User,Integer> {
Optional<User> findByUserName(String userName);
}
