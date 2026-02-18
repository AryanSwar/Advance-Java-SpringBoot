package com.jsp.first.controller;

import com.jsp.first.Person;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping(value = "/hello")
    public String hello(){
        System.out.println("/hello");
//        System.out.println(req);
//        System.out.println(resp);
        //logic
        return "hello world";

    }
    @PostMapping("/save")
    public Person save(@RequestBody Person person){
        //dp
        return person;
    }

    @GetMapping("/find")
//    public String find(@RequestParam("id") int id, @RequestParam("name") String name){
    public String find(@RequestParam int id, @RequestParam("name") String names){
        //
        return id+names;
    }
}
