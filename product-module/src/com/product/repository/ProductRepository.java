package com.product.repository;

import com.product.domain.Product;

public interface ProductRepository {

    void save(Product product);

    Product findById(String id);
}
