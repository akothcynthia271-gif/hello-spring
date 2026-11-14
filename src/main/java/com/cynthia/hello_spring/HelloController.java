package com.cynthia.hello_spring;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "Hello, Spring Boot! ";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "hello, " + name + " !";
    }
    @GetMapping ("/add")
    public String add(@RequestParam int a, @RequestParam int b){
        return "Sum = " + (a+b);
        }
    @GetMapping("/about")
    public String about(){
        return "This is my first spring boot application";
    }
    @GetMapping("/health")
    public String health(){
        return "OK";
    }
    @GetMapping("/square/{n}")
    public int square(@PathVariable int n){
        return n * n;
    }
    @GetMapping("/multiply")
    public int multiply(@RequestParam int a,@RequestParam int b){
        return (a*b);
    }
    @GetMapping("/is-even/{n}")
    public String isEven(@PathVariable int n){
        if(n%2==0){
            return "Is even";
        }else{
            return "Is odd";
        }
    }

    }


