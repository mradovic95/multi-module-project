package com.order.service;

import com.order.dto.OrderDtoCreate;
import com.order.repository.OrderRepository;
import com.order.repository.OrderRepositoryInMemory;
import com.product.service.ProductService;

public class OrderService {

    private final OrderRepository orderRepository = new OrderRepositoryInMemory();
    private final ProductService productService = new ProductService();

    public void save(OrderDtoCreate orderDtoCreate) {
    }
}
