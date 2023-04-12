package com.streamPractice.groceryTrolley.service.customer.command;

import com.streamPractice.groceryTrolley.model.CustomerModel;
import com.streamPractice.groceryTrolley.service.Command;
import lombok.Data;

import java.util.List;


@Data
public abstract class CustomerCommand implements Command {

    public abstract List<CustomerModel> get();

}
