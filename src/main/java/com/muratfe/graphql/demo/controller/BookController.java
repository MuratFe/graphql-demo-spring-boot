package com.muratfe.graphql.demo.controller;

import com.muratfe.graphql.demo.service.BookService;
import com.muratfe.graphql.demo.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @QueryMapping
    public Book getBookById(@Argument String id ){
        return bookService.getById(id);
    }

    @QueryMapping
    public List<Book> getBooksByIds(@Argument List<String> ids) {
        return bookService.getByIds(ids);
    }

    @QueryMapping
    public List<Book> getAllBooks() {
        return bookService.getAll();
    }
}
