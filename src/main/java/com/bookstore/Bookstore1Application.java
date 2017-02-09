package com.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bookstore.model.Book;
import com.bookstore.model.BookRepository;


@SpringBootApplication
public class Bookstore1Application {
	private static final Logger log = LoggerFactory.getLogger(Bookstore1Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Bookstore1Application.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Title of a Book","Author Authorius", 2017, "123456-6543", 55.40));
			repository.save(new Book("Title of an other Book","Authorius Authorius", 2017, "189456-657843", 30.00));	

			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}
