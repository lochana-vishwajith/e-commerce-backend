package com.order.order.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String items;

    private double totalAmount;

    private int customer;

    private String shippingAddress;

    private String billingAddress;

    private String specialNotes;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status", nullable = false, length = 32)
    private OrderStatus orderStatus;


    @Override
    public String toString(){
        return "Order{items : " + items.toString() + " totalAmount : " + totalAmount + " customer : " + customer + " shippingAddress : " + shippingAddress + " billingAddress : " + billingAddress + " specialNotes : " + specialNotes + " orderStatus : " + orderStatus + " }";
    }
}
