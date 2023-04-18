package com.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.entity.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/16
 * @Time 16:47
 */
@RestController
public class CircleBreakerController {

    private static final String SERVICE_URL = "http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/payment")
    public CommonResult payment(@PathVariable("id") Long id) {

        String forObject = restTemplate.getForObject(SERVICE_URL + "/payment/nacos/" + id, String.class);
        return new CommonResult(200, forObject);
    }


    @GetMapping("/consumer/fallback/{id}")
    @SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHandler", exceptionsToIgnore = {IllegalArgumentException.class})
    public CommonResult fallback(@PathVariable("id") Long id) {
        String forObject = restTemplate.getForObject(SERVICE_URL + "/payment/nacos/" + id, String.class);

        if (id == 4) {
            throw new IllegalArgumentException("非法参数异常");
        }
        return new CommonResult(200, forObject);
    }
    public CommonResult handlerFallback(@PathVariable("id") Long id, Throwable throwable) {
        return new CommonResult(444, "java异常");
    }
    public CommonResult blockHandler(@PathVariable("id") Long id, BlockException blockException) {
        return new CommonResult(444, "sentinel限流");
    }




}
