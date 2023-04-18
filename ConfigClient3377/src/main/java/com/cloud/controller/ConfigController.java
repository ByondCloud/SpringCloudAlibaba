package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/15
 * @Time 16:05
 */
@RestController
@RefreshScope // 动态刷新
@RequestMapping("/config")
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;


    @GetMapping("/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
