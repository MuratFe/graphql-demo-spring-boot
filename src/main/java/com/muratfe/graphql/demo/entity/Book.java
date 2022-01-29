package com.muratfe.graphql.demo.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Book {
    private String id;
    private String name;
    private int pageCount;
    private Author author;
}
