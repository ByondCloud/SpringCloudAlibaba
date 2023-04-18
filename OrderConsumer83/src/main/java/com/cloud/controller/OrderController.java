package com.cloud.controller;

import com.cloud.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/15
 * @Time 12:59
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject( "http://nacos-payment-provider/payment/nacos/" + id, String.class);
    }


    @Resource
    private PaymentService paymentService;

    @GetMapping("/openfeign/{id}")
    public String openfeign(@PathVariable("id") Integer id) {
        String payment = paymentService.getPayment(id);
        return payment;
    }


}
