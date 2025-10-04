package com.order.order.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.order.order.DTO.OrderDTO;
import com.order.order.Model.Order;
import com.order.order.Response.OrderResponse;
import com.order.order.Service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class orderController {
    private static Logger LOGGER = LoggerFactory.getLogger(orderController.class);

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(@RequestBody Order order) throws Exception {
        LOGGER.info("[Order] Request received to order controller to create an order - {}", order.toString());
        OrderDTO orderDTO = objectMapper.convertValue(order, OrderDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.createOrder(orderDTO));
    }
}
