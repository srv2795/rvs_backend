package com.example.GraphQLProject.graphqldemo.service;

import com.example.GraphQLProject.graphqldemo.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    Book createBook(Book book);

    List<Book> getAllBook();

    Book getSingleBook(Integer bookId);

    String deleteBook(Integer bookId);
}
