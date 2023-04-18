package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/16
 * @Time 20:35
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Order2001 {
    public static void main(String[] args) {
        SpringApplication.run(Order2001.class, args);
    }
}
