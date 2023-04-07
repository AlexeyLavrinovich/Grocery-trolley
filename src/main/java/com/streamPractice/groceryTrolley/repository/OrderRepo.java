package com.streamPractice.groceryTrolley.repository;

import com.streamPractice.groceryTrolley.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
