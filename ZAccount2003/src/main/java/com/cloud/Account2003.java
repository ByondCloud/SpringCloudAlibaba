package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/17
 * @Time 10:32
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Account2003 {
    public static void main(String[] args) {
        SpringApplication.run(Account2003.class, args);
    }
}
