package com.order.repository;


import com.order.domain.Order;
import com.order.repository.OrderRepository;

import java.util.HashMap;
import java.util.Map;

public class OrderRepositoryInMemory implements OrderRepository {

    private Map<String, Order> map = new HashMap<>();

    @Override
    public void save(Order product) {
        map.put(product.getId(), product);
    }

    @Override
    public Order findById(String id) {
        return map.get(id);
    }
}
