package com.selfpayment.payment.control.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentControlService {
  public String getWelcome() {

    return "Welcome to payment control.";
  }
}
