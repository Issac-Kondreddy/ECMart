package com.ecmart.paymentservice.service;

import com.ecmart.paymentservice.model.Payment;
import com.ecmart.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment processPayment(Payment payment) {
        payment.setPaymentDate(LocalDateTime.now());

        // For now, we simulate the payment as always successful
        payment.setStatus("SUCCESS");

        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    @Override
    public Payment getPaymentByOrderId(Long orderId) {
        Optional<Payment> payment = paymentRepository.findByOrderId(orderId);
        return payment.orElse(null);
    }
}
