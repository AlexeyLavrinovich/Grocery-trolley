package com.streamPractice.groceryTrolley.service;

import java.util.List;

public interface Service {
    List<?> doCommand(Command command);
}
