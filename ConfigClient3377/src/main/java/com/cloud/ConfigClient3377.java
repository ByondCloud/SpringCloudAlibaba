package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/15
 * @Time 16:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient3377 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3377.class, args);
    }
}
