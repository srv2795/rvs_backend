package com.example.ReactiveApplication.controller;

import com.example.ReactiveApplication.entity.Book;
import com.example.ReactiveApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/env")
    public String getEnv() {
        return "Application is running fine...";
    }

    @PostMapping("/new")
    public Mono<Book> createNewBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/getAll")
    public Flux<Book> getAll() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{bookId}")
    public Mono<Book> getOneBook(@PathVariable("bookId") int bookId) {
        return bookService.getSingleBook(bookId);
    }

    @PutMapping("/{bookId}")
    public Mono<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {
        return bookService.update(book, bookId);
    }

    @DeleteMapping("/{bookId}")
    public Mono<Void> deleteBook(@PathVariable("bookId") int bookId) {
        return bookService.deleteBook(bookId);
    }
}
