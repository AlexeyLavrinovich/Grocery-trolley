package com.streamPractice.groceryTrolley.model;

import com.streamPractice.groceryTrolley.entity.Customer;
import com.streamPractice.groceryTrolley.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderModel {
    private Long id;

    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;

    private Customer customer;
    private List<Product> products;
}
