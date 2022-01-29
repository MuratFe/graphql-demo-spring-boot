package com.muratfe.graphql.demo.service;

import com.muratfe.graphql.demo.entity.Book;
import com.muratfe.graphql.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BookService {
   private final BookRepository bookRepository;

    public Book getById(final String id) {
        return bookRepository.getById(id);
    }

    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    public List<Book> getByIds(final List<String> ids) {
        return bookRepository.getByIds(ids);
    }
}
