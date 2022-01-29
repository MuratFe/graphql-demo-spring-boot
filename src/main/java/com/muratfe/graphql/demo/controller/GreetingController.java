package com.muratfe.graphql.demo.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;

@Controller
public class GreetingController {

    @QueryMapping
    public String greeting(@Argument String name){
        if(ObjectUtils.isEmpty(name)) {
            name = "World";
        }

        return String.format( "Hello %s!", name);
    }
}
