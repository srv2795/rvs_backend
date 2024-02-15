package com.example.ReactiveApplication.service.impl;

import com.example.ReactiveApplication.entity.Book;
import com.example.ReactiveApplication.repository.BookRepository;
import com.example.ReactiveApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Mono<Book> createBook(Book book) {
        Mono<Book> bookMono = bookRepository.save(book);
        return bookMono;
    }

    @Override
    public Flux<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Mono<Book> getSingleBook(int bookId) {
        Mono<Book> bookItem = bookRepository.findById(Mono.just(bookId));
        return bookItem;
    }

    @Override
    public Mono<Book> update(Book book, Integer bookId) {
        Mono<Book> oldBook = bookRepository.findById(bookId);
        return oldBook.flatMap(book1 -> {
            book1.setBookId(book.getBookId());
            book1.setName(book.getName());
            book1.setDescriptions(book.getDescriptions());
            book1.setPublisher(book.getPublisher());
            return bookRepository.save(book1);
        });
    }

    @Override
    public Mono<Void> deleteBook(int id) {
        return bookRepository
                .findById(id)
                .flatMap(book1 -> bookRepository.delete(book1));
    }

    @Override
    public Flux<Book> search(String query) {
        return null;
    }
}
