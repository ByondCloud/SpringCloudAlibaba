package com.cloud.service;


import org.springframework.stereotype.Component;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/16
 * @Time 17:43
 */
@Component
public class PaymentServiceFallback implements PaymentService {
    @Override
    public String getPayment(Integer id) {
        return "兜底的方法";
    }
}
