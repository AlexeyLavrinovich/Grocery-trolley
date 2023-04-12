package com.streamPractice.groceryTrolley.service.customer.command;

import com.streamPractice.groceryTrolley.mapper.CustomerMapper;
import com.streamPractice.groceryTrolley.model.CustomerModel;
import com.streamPractice.groceryTrolley.repository.CustomerRepo;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class GetAllCustomerCommand extends CustomerCommand {

    protected CustomerRepo customerRepo;

    @Override
    public List<CustomerModel> get() {
        return customerRepo.findAll().stream()
                .map(CustomerMapper.INSTANCE::mapToModel)
                .collect(Collectors.toList());
    }
}
