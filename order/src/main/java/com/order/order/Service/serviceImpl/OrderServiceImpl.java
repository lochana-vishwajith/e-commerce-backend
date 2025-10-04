package com.order.order.Service.serviceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.order.order.DTO.OrderDTO;
import com.order.order.Model.Order;
import com.order.order.Model.OrderItems;
import com.order.order.Repo.OrderRepository;
import com.order.order.Response.OrderResponse;
import com.order.order.Service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private static Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public OrderResponse createOrder(OrderDTO orderDTO) throws Exception {
        LOGGER.info("[Order] Starting to create order - {}", orderDTO);

        Order order = objectMapper.convertValue(orderDTO, Order.class);

        try {
            Order createdOrder = orderRepository.save(order);

            OrderResponse response  = new OrderResponse();
            response.setData(createdOrder);
            response.setStatus(HttpStatus.CREATED);

            return response;
        } catch (Exception e) {
            LOGGER.error("[Order] - Error occurred when saving the order - {}", e.getMessage());
            throw new Exception("Error occurred when saving the order");
        }
    }
}
