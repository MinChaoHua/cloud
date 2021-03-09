package com.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController()
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/payment/zoo")
    public String getZookeeper(){
        return String.format("SpringCloud with Zookeeper,%s,%s",port, UUID.randomUUID().toString());
    }

}
