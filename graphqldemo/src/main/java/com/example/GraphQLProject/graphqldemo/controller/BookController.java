package com.example.GraphQLProject.graphqldemo.controller;

import com.example.GraphQLProject.graphqldemo.entity.Book;
import com.example.GraphQLProject.graphqldemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*@RestController
@RequestMapping("/v1/api/books")*/
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    /*@PostMapping("/")*/
    public Book createBook(@RequestBody Book book) {
        return this.bookService.createBook(book);
    }

    /*@GetMapping("/all")*/
    @QueryMapping("getAllBooks")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBook();
    }

    /*@GetMapping("/single/{bookId}")*/
    @QueryMapping("getSingleBook")
    public Book getSingleBook(/*@PathVariable*/ @Argument Integer bookId) {
        return this.bookService.getSingleBook(bookId);
    }

    /*@DeleteMapping("/remove/{id}")*/
    public void deleteOneBook(/*@PathVariable("id")*/ Integer bookId) {
        this.bookService.deleteBook(bookId);
    }
}
