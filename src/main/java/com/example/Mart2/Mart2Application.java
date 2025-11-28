package com.example.Mart2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.product.Repository")
@EntityScan(basePackages = "com.product.Entity")
@ComponentScan("com.product")
public class Mart2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mart2Application.class, args);
		System.out.println("Working....");
	}

}
