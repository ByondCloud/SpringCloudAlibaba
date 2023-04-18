package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/15
 * @Time 12:54
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderConsumer83 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumer83.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
