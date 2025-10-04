package com.order.order.Model;

public enum OrderStatus {
    PENDING("pending"),
    PAID("paid"),
    SHIPPED("shipped"),
    DELIVERED("delivered"),
    CANCELED("canceled");

    OrderStatus(String status) {

    }
}
