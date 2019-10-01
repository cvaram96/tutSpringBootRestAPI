package com.personal.starterWeb.Dao;

import com.personal.starterWeb.Bean.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookMysqlDao extends CrudRepository<Book, Integer> {

}
