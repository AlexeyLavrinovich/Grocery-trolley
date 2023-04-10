package com.streamPractice.groceryTrolley.mapper;

import com.streamPractice.groceryTrolley.entity.Customer;
import com.streamPractice.groceryTrolley.model.CustomerModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class CustomerMapper {

    public static final CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    public abstract Customer mapToEntity(CustomerModel customerModel);

    public abstract CustomerModel mapToModel(Customer customer);

}
