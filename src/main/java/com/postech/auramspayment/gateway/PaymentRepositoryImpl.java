package com.postech.auramspayment.gateway;

import com.postech.auramspayment.domain.Payment;
import com.postech.auramspayment.gateway.database.jpa.entity.PaymentEntity;
import com.postech.auramspayment.gateway.database.jpa.repository.PaymentJpaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PaymentRepositoryImpl implements PaymentRepository {

    private final PaymentJpaRepository paymentJpaRepository;
    private final ModelMapper modelMapper;

    public PaymentRepositoryImpl(PaymentJpaRepository paymentJpaRepository, ModelMapper modelMapper) {
        this.paymentJpaRepository = paymentJpaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void processPayment(Payment payment) {

        PaymentEntity paymentEntity = modelMapper.map(payment, PaymentEntity.class);
    }

}
