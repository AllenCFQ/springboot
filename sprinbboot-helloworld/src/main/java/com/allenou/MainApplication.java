package com.allenou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.util.Base64Utils;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class MainApplication {
    public static void main(String[] args) {

        System.out.println(MainApplication.class);
        System.out.println("2");
        SpringApplication.run(MainApplication.class,args);
        System.out.println("3");


    }
}
