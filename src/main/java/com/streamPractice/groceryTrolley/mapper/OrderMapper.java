package com.streamPractice.groceryTrolley.mapper;

import com.streamPractice.groceryTrolley.entity.Order;
import com.streamPractice.groceryTrolley.model.OrderModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CustomerMapper.class, ProductMapper.class})
public abstract class OrderMapper {

    public static final OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    public abstract Order mapToEntity (OrderModel orderModel);

    public abstract OrderModel mapToModel (Order order);

}