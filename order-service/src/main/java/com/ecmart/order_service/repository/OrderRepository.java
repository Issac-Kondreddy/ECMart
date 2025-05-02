package com.ecmart.order_service.repository;

import com.ecmart.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUserId(Long userId);

    List<Order> findByProductId(Long productId);

    List<Order> findByStatus(String status);
}
