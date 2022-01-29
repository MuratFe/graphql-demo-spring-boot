package com.muratfe.graphql.demo.repository;

import com.muratfe.graphql.demo.entity.Author;
import com.muratfe.graphql.demo.entity.Book;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DummyBookRepository implements BookRepository{
    List<Book> books = List.of(
            Book.builder().id("book-1").name("test1").pageCount(1).author(buildAuthor(1)).build(),
            Book.builder().id("book-2").name("test2").pageCount(2).author(buildAuthor(2)).build(),
            Book.builder().id("book-3").name("test3").pageCount(3).author(buildAuthor(3)).build(),
            Book.builder().id("book-4").name("test4").pageCount(4).author(buildAuthor(4)).build(),
            Book.builder().id("book-5").name("test5").pageCount(5).author(buildAuthor(5)).build()
    );

    private Author buildAuthor(int number) {
        return Author.builder().id("author-" + number).firstName("firstname-" + number).lastName("lastname-" + number).build();
    }

    @Override
    public Book getById(final String id) {
        return books.stream().filter(book -> book.getId().equals( id)).findFirst().orElse(null);
    }

    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public List<Book> getByIds(final List<String> ids) {
        return books.stream().filter(book -> ids.contains(book.getId())).collect(Collectors.toList());
    }
}
