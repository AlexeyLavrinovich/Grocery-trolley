package com.streamPractice.groceryTrolley.mapper;

import com.streamPractice.groceryTrolley.entity.Product;
import com.streamPractice.groceryTrolley.model.ProductModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class ProductMapper {

    public static final ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    public abstract Product mapToEntity (ProductModel productModel);

    public abstract ProductModel mapToModel (Product product);
}
