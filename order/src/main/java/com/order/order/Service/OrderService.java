package com.order.order.Service;

import com.order.order.DTO.OrderDTO;
import com.order.order.Response.OrderResponse;

public interface OrderService {

    OrderResponse createOrder(OrderDTO orderDTO) throws Exception;
}
