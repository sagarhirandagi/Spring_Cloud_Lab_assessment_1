
package com.zensar.service;import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.entity.Payment;
import com.zensar.repository.PaymentRepository;
@Service
public class PaymentService {
@Autowired
private PaymentRepository repository;
public Payment doPayment(Payment payment) {
payment.setTransactionId(UUID.randomUUID().toString());
return repository.save(payment);
}}

