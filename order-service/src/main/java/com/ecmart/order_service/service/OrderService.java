package com.ecmart.order_service.service;

import com.ecmart.order_service.model.Order;

import java.util.List;

public interface OrderService {

    Order placeOrder(Order order);

    List<Order> getAllOrders();

    Order getOrderById(Long id);

    List<Order> getOrdersByUserId(Long userId);

    Order updateOrder(Long id, Order order);

    void deleteOrder(Long id);
}
