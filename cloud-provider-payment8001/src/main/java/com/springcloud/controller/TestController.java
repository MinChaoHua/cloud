package com.springcloud.controller;

import com.springcloud.entity.CommonResult;
import com.springcloud.entity.PageEntity;
import com.springcloud.entity.PageResult;
import com.springcloud.entity.Payment;
import com.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/index")
    public String toIndex() {
        System.out.println("你好");
        return "index";
    }

    /**
     * 分页查询
     * @param page 页数
     * @param size 页面条数
     * @param payment 查询条件，用实体类接收
     * */
    @ResponseBody
    @PostMapping(value = "/getAll")
    public CommonResult<PageResult<List<Payment>>> getAll(@Param("page") int page, @Param("size") int size, Payment payment){
        return new CommonResult<>(200,"查询成功",paymentService.findAll(page,size,payment));
    }

}
