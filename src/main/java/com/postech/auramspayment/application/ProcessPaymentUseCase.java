package com.postech.auramspayment.application;

import com.postech.auramspayment.domain.Payment;
import com.postech.auramspayment.gateway.PaymentRepository;

public class ProcessPaymentUseCase {

    private final PaymentRepository paymentRepository;

    public ProcessPaymentUseCase(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public void execute(Payment payment) {
        if (payment == null) {
            throw new IllegalArgumentException("O pagamento não pode ser nulo.");
        }
        paymentRepository.processPayment(payment);
    }
}
