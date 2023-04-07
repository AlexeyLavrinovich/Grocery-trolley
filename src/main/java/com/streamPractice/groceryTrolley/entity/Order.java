package com.streamPractice.groceryTrolley.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "product_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "order_product",
            joinColumns = { @JoinColumn (name = "order_id") },
            inverseJoinColumns = { @JoinColumn (name = "product_id") }
    )
    @ToString.Exclude
    private List<Product> products;

}
