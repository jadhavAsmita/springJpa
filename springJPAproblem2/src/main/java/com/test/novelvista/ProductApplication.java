package com.test.novelvista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	public static void main(String args[]) {
		SpringApplication.run(ProductApplication.class, args);
		System.out.println("Product Service Started...");
	}
}