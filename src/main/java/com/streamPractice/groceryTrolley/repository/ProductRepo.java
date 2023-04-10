package com.streamPractice.groceryTrolley.repository;

import com.streamPractice.groceryTrolley.entity.Product;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long> {
    @Override
    @EntityGraph(value = "product-entity-graph", type = EntityGraph.EntityGraphType.LOAD)
    List<Product> findAll();
}
