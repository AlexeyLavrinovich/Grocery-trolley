package com.streamPractice.groceryTrolley.model;

import com.streamPractice.groceryTrolley.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductModel {
    private Long id;

    private String name;
    private String category;
    private Double price;

    private List<Order> orders;
}
