package com.product.repository.impl;

import com.product.domain.Product;
import com.product.repository.ProductRepository;

import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryInMemory implements ProductRepository {

    private Map<String, Product> map = new HashMap<>();

    @Override
    public void save(Product product) {
        map.put(product.getId(), product);
    }

    @Override
    public Product findById(String id) {
        return map.get(id);
    }
}
