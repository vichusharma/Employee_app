package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/hello")
public class HelloResource {
    @GetMapping
    public String helloWorld()
    {
        return "hello World";
    }

    @GetMapping(value = "/json")
    public Hello json(){
       return new Hello("Greetings","Hello World");


    }

    private class Hello{

        private String title;
        private String value;

        public Hello(String title, String value) {
            this.title = title;
            this.value = value;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}

