package com.product.mapper;

import com.product.domain.Product;
import com.product.dto.ProductDto;
import com.product.dto.ProductDtoCreate;

import java.util.UUID;

public class ProductMapper {

    public Product productFromProductDtoCreate(ProductDtoCreate productDtoCreate) {
        return new Product(UUID.randomUUID().toString(), productDtoCreate.getTitle(), productDtoCreate.getDescription(),
                productDtoCreate.getLongDescription(), productDtoCreate.getCreatedAt(), productDtoCreate.getPrice());
    }

    public ProductDto productDtoFromProduct(Product product) {
        return new ProductDto(product.getId(), product.getTitle(), product.getPrice());
    }
}
