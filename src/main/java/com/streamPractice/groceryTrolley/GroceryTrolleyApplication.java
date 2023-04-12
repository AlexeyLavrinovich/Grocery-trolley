package com.streamPractice.groceryTrolley;

import com.streamPractice.groceryTrolley.mapper.OrderMapper;
import com.streamPractice.groceryTrolley.mapper.ProductMapper;
import com.streamPractice.groceryTrolley.repository.CustomerRepo;
import com.streamPractice.groceryTrolley.repository.OrderRepo;
import com.streamPractice.groceryTrolley.repository.ProductRepo;
import com.streamPractice.groceryTrolley.service.Service;
import com.streamPractice.groceryTrolley.service.customer.CustomerService;
import com.streamPractice.groceryTrolley.service.customer.command.GetAllCustomerCommand;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@SpringBootApplication
public class GroceryTrolleyApplication implements org.springframework.boot.ApplicationRunner{

	private final CustomerRepo customerRepo;
	private final OrderRepo orderRepo;
	private final ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(GroceryTrolleyApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("-----------Orders----------");
		orderRepo.findAll().stream().map(OrderMapper.INSTANCE::mapToModel).forEach(System.out::println);
		System.out.println("---------------------------");
		System.out.println("-----------Products----------");
		productRepo.findAll().stream().map(ProductMapper.INSTANCE::mapToModel).forEach(System.out::println);
		System.out.println("-----------------------------");
		System.out.println("-----------Customer----------");
		Service customerService = new CustomerService();
		customerService.doCommand(new GetAllCustomerCommand(customerRepo)).forEach(System.out::println);
		System.out.println("-----------------------------");
	}
}
