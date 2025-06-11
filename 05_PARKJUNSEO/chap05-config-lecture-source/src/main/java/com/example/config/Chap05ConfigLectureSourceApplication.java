package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Chap05ConfigLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap05ConfigLectureSourceApplication.class, args);
    }

}
