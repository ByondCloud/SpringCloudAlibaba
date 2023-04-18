package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/15
 * @Time 12:18
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    int i = 0;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {

        return "serverPort: " + serverPort + "\t" + "id: " + id + "\t" + "第" + i++ + "次调用";
    }
}
