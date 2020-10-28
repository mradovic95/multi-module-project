package com.product.domain;

import java.math.BigDecimal;
import java.time.Instant;

public class Product {

    private String id;
    private String title;
    private String description;
    private String longDescription;
    private Instant createdAt;
    private BigDecimal price;

    public Product() {

    }

    public Product(String id, String title, String description, String longDescription, Instant createdAt, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.longDescription = longDescription;
        this.createdAt = createdAt;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
