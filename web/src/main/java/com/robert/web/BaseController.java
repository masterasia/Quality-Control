package com.robert.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseController {

    /**
     * the main method to start the web server.
     * args:
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(BaseController.class,args);
    }
}
