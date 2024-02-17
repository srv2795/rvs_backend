package com.example.GraphQLProject.graphqldemo;

import com.example.GraphQLProject.graphqldemo.entity.Book;
import com.example.GraphQLProject.graphqldemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqldemoApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqldemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setId(1);
		b1.setTitle("BhagwatGita");
		b1.setDesc("The Holy book produced from Lord Krishna");
		b1.setAuthor("Lord Krishna");

		Book b2 = new Book();
		b2.setId(2);
		b2.setTitle("Ramayana");
		b2.setDesc("The Holy book for Lord Ram");
		b2.setAuthor("Valmiki");

		this.bookService.createBook(b1);
		this.bookService.createBook(b2);
	}
}
