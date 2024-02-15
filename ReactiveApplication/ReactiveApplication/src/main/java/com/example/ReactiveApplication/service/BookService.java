package com.example.ReactiveApplication.service;

import com.example.ReactiveApplication.entity.Book;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface BookService {

    public Mono<Book> createBook(Book book);

    public Flux<Book> getAllBooks();

    public Mono<Book> getSingleBook(int bookId);

    public Mono<Book> update(Book book, Integer bookId);

    public Mono<Void> deleteBook(int id);

    public Flux<Book> search(String query);
}
