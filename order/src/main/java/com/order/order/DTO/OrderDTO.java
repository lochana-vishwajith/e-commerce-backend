package com.order.order.DTO;

import com.order.order.Model.OrderItems;
import com.order.order.Model.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private String items;

    private double totalAmount;

    private int customer;

    private String shippingAddress;

    private String billingAddress;

    private String specialNotes;

    private OrderStatus orderStatus;


    @Override
    public String toString(){
        return "Order{items : " + items.toString() + " totalAmount : " + totalAmount + " customer : " + customer + " shippingAddress : " + shippingAddress + " billingAddress : " + billingAddress + " specialNotes : " + specialNotes + " }";
    }
}
