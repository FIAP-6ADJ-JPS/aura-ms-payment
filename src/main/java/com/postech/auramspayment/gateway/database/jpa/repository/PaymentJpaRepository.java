package com.postech.auramspayment.gateway.database.jpa.repository;

import com.postech.auramspayment.gateway.database.jpa.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentJpaRepository extends JpaRepository<PaymentEntity, Long> {
}
