package com.technicalajeet.springthymeleafcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.technicalajeet.springthymeleafcrud.repository")
@EnableTransactionManagement
@EntityScan(basePackages = "com.technicalajeet.springthymeleafcrud.models")
public class SpringThymeleafCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringThymeleafCrudApplication.class, args);
    }

}
