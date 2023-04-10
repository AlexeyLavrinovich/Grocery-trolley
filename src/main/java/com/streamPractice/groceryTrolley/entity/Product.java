package com.streamPractice.groceryTrolley.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table (name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double price;

    @ManyToMany(mappedBy = "products")
    @ToString.Exclude
    private List<Order> orders;

}
