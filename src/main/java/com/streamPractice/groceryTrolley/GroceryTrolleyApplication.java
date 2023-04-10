package com.streamPractice.groceryTrolley;

import com.streamPractice.groceryTrolley.mapper.OrderMapper;
import com.streamPractice.groceryTrolley.repository.OrderRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@SpringBootApplication
public class GroceryTrolleyApplication implements org.springframework.boot.ApplicationRunner{

	private final OrderRepo orderRepo;

	public static void main(String[] args) {
		SpringApplication.run(GroceryTrolleyApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("-----------Orders----------");
		orderRepo.findAll().forEach(System.out::println);
		System.out.println("---------------------------");
	}
}
