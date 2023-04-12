package com.streamPractice.groceryTrolley.service.customer.command;

import com.streamPractice.groceryTrolley.mapper.CustomerMapper;
import com.streamPractice.groceryTrolley.model.CustomerModel;
import com.streamPractice.groceryTrolley.repository.CustomerRepo;
import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class GetAllSortedByIdCustomerCommand extends CustomerCommand{

    protected CustomerRepo customerRepo;

    @Override
    public List<CustomerModel> get() {
        return customerRepo.findAll().stream()
                .map(CustomerMapper.INSTANCE::mapToModel)
                .sorted(Comparator.comparing(CustomerModel::getId))
                .collect(Collectors.toList());
    }
}
