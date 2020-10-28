package com.order.repository;

import com.order.domain.Order;

public interface OrderRepository {

    void save(Order order);

    Order findById(String id);
}
