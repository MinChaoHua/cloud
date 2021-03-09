package com.springcloud.mapper;

import com.springcloud.entity.PageEntity;
import com.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
    List<Payment> findAll(@Param("pageEntity")PageEntity<String,Payment> pageEntity);
}
