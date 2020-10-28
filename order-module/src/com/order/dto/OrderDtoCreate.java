package com.order.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderDtoCreate {

    private List<OrderItem> orderItemList = new ArrayList<>();

    public static class OrderItem {
        private Long count;
        private Long productId;
    }
}
