package com.order.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private List<OrderItem> orderItemList = new ArrayList<>();

    public Order() {

    }

    public Order(String id, List<OrderItem> orderItemList) {
        this.id = id;
        this.orderItemList = orderItemList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
