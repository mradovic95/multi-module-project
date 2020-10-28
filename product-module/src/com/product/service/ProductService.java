package com.product.service;

import com.product.dto.ProductDto;
import com.product.dto.ProductDtoCreate;
import com.product.mapper.ProductMapper;
import com.product.repository.ProductRepository;
import com.product.repository.impl.ProductRepositoryInMemory;

import java.util.Optional;

public class ProductService {

    private final ProductRepository productRepository = new ProductRepositoryInMemory();
    private final ProductMapper productMapper = new ProductMapper();

    public void save(ProductDtoCreate productDtoCreate) {
        productRepository.save(productMapper.productFromProductDtoCreate(productDtoCreate));
    }


    public ProductDto findById(String id) {
        return Optional.ofNullable(productRepository.findById(id))
                .map(productMapper::productDtoFromProduct)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
