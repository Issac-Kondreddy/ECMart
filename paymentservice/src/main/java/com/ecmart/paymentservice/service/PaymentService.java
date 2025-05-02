package com.ecmart.paymentservice.service;

import com.ecmart.paymentservice.model.Payment;

import java.util.List;

public interface PaymentService {

    Payment processPayment(Payment payment);

    List<Payment> getAllPayments();

    Payment getPaymentById(Long id);

    Payment getPaymentByOrderId(Long orderId);
}
