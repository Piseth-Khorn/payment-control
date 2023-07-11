package com.selfpayment.payment.control.controller;

import com.selfpayment.payment.control.service.PaymentControlService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/payment-control")
@RequiredArgsConstructor
public class PaymentControlController {
  private final PaymentControlService paymentControlService;

  @GetMapping
  public ResponseEntity<String> welcome() {
    return new ResponseEntity<>(this.paymentControlService.getWelcome(), HttpStatus.OK);
  }
}
