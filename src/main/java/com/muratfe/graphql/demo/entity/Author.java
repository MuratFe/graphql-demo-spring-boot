package com.muratfe.graphql.demo.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Author {
    private String id;
    private String firstName;
    private String lastName;
}
