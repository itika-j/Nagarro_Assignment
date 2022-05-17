package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;


@SpringBootApplication
public class SpringAssignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAssignApplication.class, args);
    }

}
