package com.postech.auramspayment.adapter.controller;

import com.postech.auramspayment.domain.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/test")
    public String test() {
        return "Test endpoint is working!";
    }

    @PostMapping
    public ResponseEntity<String> createPayment(@RequestBody Payment payment) {

        return ResponseEntity.ok("Pagamento recebido com sucesso!");
    }
}
