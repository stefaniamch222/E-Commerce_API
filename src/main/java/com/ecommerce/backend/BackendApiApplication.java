package com.ecommerce.backend;

import com.ecommerce.backend.model.Product;
import com.ecommerce.backend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class BackendApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApiApplication.class, args);
	}

	// Insert sample test data on startup
	@Bean
	public CommandLineRunner demoData(ProductRepository repository) {
		return args -> {
			repository.save(new Product("Gaming Mouse", "High-precision RGB optical mouse", new BigDecimal("49.99"), 20));
			repository.save(new Product("Mechanical Keyboard", "Backlit red switch keyboard", new BigDecimal("89.00"), 10));
		};
	}
}
