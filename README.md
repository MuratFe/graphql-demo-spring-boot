# GraphQL Demo Project With Java Spring Boot
A simple GraphQL project with Java Spring Boot.

#### Playground, Altair, Voyager are enabled on local environment. You can access using below urls after run project
- [Playground](http://localhost:8080/playground) 
- [Altair](http://localhost:8080/altair)
- [Voyager](http://localhost:8080/voyager)

### Example Query:

```
query {
  oneBook: getBookById(id: "book-1") {
    ...BookInfo
  }

  books: getBooksByIds(ids: ["book-2", "book-3"]) {
    ...BookInfo
  }

  helloWorld: greeting
  helloMurat: greeting(name: "Murat")
}

fragment BookInfo on Book {
  name
  pageCount
  author {
    firstName
    lastName
  }
}
```

Example curl request:
```
curl 'http://localhost:8080/graphql' -H 'Accept-Encoding: gzip, deflate, br' -H 'Content-Type: application/json' -H 'Accept: application/json' -H 'Connection: keep-alive' -H 'DNT: 1' -H 'Origin: http://localhost:8080' --data-binary '{"query":"query {\n  oneBook: getBookById(id: \"book-1\") {\n    ...BookInfo\n  }\n\n  books: getBooksByIds(ids: [\"book-2\", \"book-3\"]) {\n    ...BookInfo\n  }\n\n  helloWorld: greeting\n  helloMurat: greeting(name: \"Murat\")\n}\n\nfragment BookInfo on Book {\n  name\n  pageCount\n  author {\n    firstName\n    lastName\n  }\n}\n"}' --compressed
```

Example Output:
```
{
  "data": {
    "oneBook": {
      "name": "test1",
      "pageCount": 1,
      "author": {
        "firstName": "firstname-1",
        "lastName": "lastname-1"
      }
    },
    "books": [
      {
        "name": "test2",
        "pageCount": 2,
        "author": {
          "firstName": "firstname-2",
          "lastName": "lastname-2"
        }
      },
      {
        "name": "test3",
        "pageCount": 3,
        "author": {
          "firstName": "firstname-3",
          "lastName": "lastname-3"
        }
      }
    ],
    "helloWorld": "Hello World!",
    "helloMurat": "Hello Murat!"
  }
}
```


### Reference Documentation
For further reference, please consider the following sections:

* [Official Spring-GraphQL Samples](https://github.com/spring-projects/spring-graphql/tree/main/samples/webmvc-http)
* [GraphQL and GraphiQL Spring Framework Boot Starters](https://github.com/graphql-java-kickstart/graphql-spring-boot)