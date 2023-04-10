package com.streamPractice.groceryTrolley;

import com.streamPractice.groceryTrolley.mapper.OrderMapper;
import com.streamPractice.groceryTrolley.mapper.ProductMapper;
import com.streamPractice.groceryTrolley.repository.OrderRepo;
import com.streamPractice.groceryTrolley.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@SpringBootApplication
public class GroceryTrolleyApplication implements org.springframework.boot.ApplicationRunner{

	private final OrderRepo orderRepo;
	private final ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(GroceryTrolleyApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		exercise3();
	}

	public void exercise1(){
		System.out.println("-----------Exercise 1----------");
		productRepo.findAll()
				.stream()
				.filter(product -> product.getCategory().equals("Books"))
				.filter(product -> product.getPrice() > 100)
				.map(ProductMapper.INSTANCE::mapToModel)
				.forEach(System.out::println);
		System.out.println("-------------------------------");
	}

	public void exercise2(){
		System.out.println("-----------Exercise 2----------");
		orderRepo.findAll()
				.stream()
				.filter(order -> order.getProducts()
						.stream()
						.anyMatch(product -> product.getCategory().equals("Baby")))
				.map(OrderMapper.INSTANCE::mapToModel)
				.forEach(System.out::println);
		System.out.println("-------------------------------");
	}

	public void exercise3(){
		System.out.println("-----------Exercise 3----------");
		productRepo.findAll()
				.stream()
				.filter(product -> product.getCategory().equals("Toys"))
				.map(product -> {
					product.setPrice(product.getPrice() * 0.9);
					return product;
				})
				.map(ProductMapper.INSTANCE::mapToModel)
				.forEach(System.out::println);
		System.out.println("-------------------------------");
	}

}
