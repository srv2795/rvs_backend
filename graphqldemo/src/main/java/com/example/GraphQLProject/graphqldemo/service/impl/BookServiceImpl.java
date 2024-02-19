package com.example.GraphQLProject.graphqldemo.service.impl;

import com.example.GraphQLProject.graphqldemo.entity.Book;
import com.example.GraphQLProject.graphqldemo.repository.BookRepository;
import com.example.GraphQLProject.graphqldemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getSingleBook(Integer bookId) {
        return bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found.")) ;
    }

    @Override
    public String deleteBook(Integer bookId) {
        Optional<Book> book = Optional.ofNullable(bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book with given id does not exist")));
        bookRepository.delete(book.get());
        return "Book with given Id got deleted...";
    }
}
