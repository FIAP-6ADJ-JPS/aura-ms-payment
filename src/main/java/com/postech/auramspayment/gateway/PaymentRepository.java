package com.postech.auramspayment.gateway;

import com.postech.auramspayment.domain.Payment;

public interface PaymentRepository {
    void processPayment(Payment payment);

}
