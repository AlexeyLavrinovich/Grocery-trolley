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
@NamedEntityGraph(
        name = "product-entity-graph",
        attributeNodes = {
                @NamedAttributeNode("name"),
                @NamedAttributeNode("category"),
                @NamedAttributeNode("price"),
                @NamedAttributeNode(value = "orders", subgraph = "order-subgraph")
        },
        subgraphs = {
                @NamedSubgraph(
                        name = "order-subgraph",
                        attributeNodes = {
                                @NamedAttributeNode("status"),
                                @NamedAttributeNode("orderDate"),
                                @NamedAttributeNode("deliveryDate"),
                                @NamedAttributeNode(value = "customer"),
                                @NamedAttributeNode(value = "products")
                        }
                )
        }
)
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
