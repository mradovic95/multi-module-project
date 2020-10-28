package com.order.domain;

import java.math.BigDecimal;

public class OrderItem {

    private Long count;
    private Product product;

    public static class Product {
        private String productId;
        private String title;
        private BigDecimal price;
    }
}
