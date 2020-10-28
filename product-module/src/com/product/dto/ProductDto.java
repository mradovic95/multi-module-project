package com.product.dto;

import java.math.BigDecimal;
import java.time.Instant;

public class ProductDto {

    private String id;
    private String title;
    private BigDecimal price;

    public ProductDto() {

    }

    public ProductDto(String id, String title, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
