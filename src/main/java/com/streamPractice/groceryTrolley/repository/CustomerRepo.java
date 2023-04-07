package com.streamPractice.groceryTrolley.repository;

import com.streamPractice.groceryTrolley.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
