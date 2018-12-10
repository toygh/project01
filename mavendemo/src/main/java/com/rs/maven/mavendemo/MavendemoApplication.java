package com.rs.maven.mavendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavendemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavendemoApplication.class, args);
        System.out.printf("启动完毕");
    }
}
