# bookmanager 
A simple REST API built on Java Spring with Java 17, Project Lombok, and Spring Data JPA.

This can be used as the back end for a client side dynamic website. 

## How does it work? 

A web server is spun up and listens for incoming HTTP requests. A `dispatcherServlet` handles all HTTP requests and 
responses, sending requests to `handlers`, in this case the classes with `@Controller` annotations whos methods have `@RequestMapping` annotations.

## Further Reading 

Spring REST API is different from a strict Spring MVC app as there is no integrated front end here. Spring MVC provides server side dynamic web page generatio through JSP. Because this REST service is still architectred in an MVC manner, the "view" here is a JSON response.  

- [Spring Web MVC](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html): docs on how Spring MVC works. 
- [Repository Pattern](http://blog.sapiensworks.com/post/2014/06/02/The-Repository-Pattern-For-Dummies.aspx)