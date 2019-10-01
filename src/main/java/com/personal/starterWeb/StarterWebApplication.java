package com.personal.starterWeb;

import com.personal.starterWeb.Dao.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserDao.class)
public class StarterWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterWebApplication.class, args);
	}

}
