package com.streamPractice.groceryTrolley.repository;

import com.streamPractice.groceryTrolley.entity.Order;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Long> {

    @Override
    @EntityGraph(value = "order-with-products-graph", type = EntityGraph.EntityGraphType.LOAD)
    List<Order> findAll();
}
