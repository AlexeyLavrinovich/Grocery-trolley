package com.streamPractice.groceryTrolley.model;

import com.streamPractice.groceryTrolley.entity.Order;
import lombok.*;

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
    @ToString.Exclude
    private List<Order> orders;
}
