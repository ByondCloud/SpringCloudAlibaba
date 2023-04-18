package com.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/16
 * @Time 17:40
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentServiceFallback.class)
public interface PaymentService {

    @GetMapping("/payment/nacos/{id}")
    String getPayment(@PathVariable("id") Integer id);
}

