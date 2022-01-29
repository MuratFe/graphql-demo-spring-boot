package com.muratfe.graphql.demo.repository;

import com.muratfe.graphql.demo.entity.Book;

import java.util.List;

public interface BookRepository {
    Book getById(String id);
    List<Book> getAll();
    List<Book> getByIds(List<String> ids);
}
