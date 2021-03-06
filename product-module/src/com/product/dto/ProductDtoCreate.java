package com.product.dto;

import java.math.BigDecimal;
import java.time.Instant;

public class ProductDtoCreate {

    private String title;
    private String description;
    private String longDescription;
    private Instant createdAt;
    private BigDecimal price;

    public ProductDtoCreate() {

    }

    public ProductDtoCreate(String id, String title, String description, String longDescription, Instant createdAt, BigDecimal price) {
        this.title = title;
        this.description = description;
        this.longDescription = longDescription;
        this.createdAt = createdAt;
        this.price = price;
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
