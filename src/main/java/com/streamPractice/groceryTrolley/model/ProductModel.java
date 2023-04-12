package com.streamPractice.groceryTrolley.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductModel {
    private Long id;

    private String name;
    private String category;
    private Double price;
}
