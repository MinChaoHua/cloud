package com.springcloud.service;

import com.springcloud.entity.PageEntity;
import com.springcloud.entity.PageResult;
import com.springcloud.entity.Payment;

import java.util.List;
import java.util.Map;

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
    PageResult<List<Payment>> findAll(int size, int page, Payment payment);
}
