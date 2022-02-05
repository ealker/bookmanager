# bookmanager 

A simple Spring-based Java RESTful web app using the MVC pattern to catalogue and display books
you want to read and books that you've already read.

This application uses Java 17, Project Lombok, and Spring Data JPA.


## Modules

- Services 
- Repository
- Controllers
- Model
- Web


## How does it work? 

A web server is spun up and listens for incoming HTTP requests. A `dispatcherServlet` handles all HTTP requests and 
responses, sending requests to `handlers`, 
in this case the classes with `@Controller` annotations whos methods have `@RequestMapping` annotations.

## Further Reading 

- [Spring Web MVC](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html): docs on how Spring MVC works. 