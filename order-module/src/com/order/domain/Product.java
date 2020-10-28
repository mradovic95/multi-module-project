package com.order.domain;

import java.math.BigDecimal;

public class Product {

    private String productId;
    private String title;
    private BigDecimal price;

    public Product(String productId, String title, BigDecimal price) {
        this.productId = productId;
        this.title = title;
        this.price = price;
    }

    public Product() {

    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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
