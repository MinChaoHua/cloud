package com.springcloud.service.impl;

import com.springcloud.entity.PageEntity;
import com.springcloud.entity.PageResult;
import com.springcloud.mapper.PaymentDao;
import com.springcloud.entity.Payment;
import com.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public PageResult<List<Payment>> findAll(int size,int page,Payment payment) {
        Map<String,Payment> map = new HashMap<>();
        PageEntity<String,Payment> pageEntity = new PageEntity<>();
        map.put("Payment",payment);
        pageEntity.setMap(map);
        pageEntity.setPage(page);
        pageEntity.setSize(size);
        PageResult<List<Payment>> pageResultList = new PageResult<>();
        pageResultList.setPage(page);
        pageResultList.setSize(size);
        pageResultList.setTotal(30);
        pageResultList.setData(paymentDao.findAll(pageEntity));
        return pageResultList;
    }
}
