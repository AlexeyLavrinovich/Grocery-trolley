package com.streamPractice.groceryTrolley.service.customer;

import com.streamPractice.groceryTrolley.service.Command;
import com.streamPractice.groceryTrolley.service.Service;

import java.util.List;

public class CustomerService implements Service {

    @Override
    public List<?> doCommand(Command command) {
        return command.get();
    }
}
