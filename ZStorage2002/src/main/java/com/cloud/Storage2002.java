package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/17
 * @Time 9:52
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Storage2002 {
    public static void main(String[] args) {
        SpringApplication.run(Storage2002.class, args);
    }
}
