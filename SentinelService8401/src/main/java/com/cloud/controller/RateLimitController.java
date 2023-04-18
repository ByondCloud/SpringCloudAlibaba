package com.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.entity.CommonResult;
import com.cloud.entity.Payment;
import com.cloud.myhandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/16
 * @Time 15:38
 */
@RestController
public class RateLimitController {

    // ---------------------------------按照名称限流------------------------------------------
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult(200, "按资源名称限流", new Payment(2020L, "serial001"));
    }
    public CommonResult handleException(BlockException blockException) {
        return new CommonResult(444, blockException.getClass().getCanonicalName() + "\t 服务不可用");
    }

    // ---------------------------------按照URL限流------------------------------------------

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200, "按URL限流", new Payment(2020L, "serial002"));
    }


    // ---------------------------------自定义限流------------------------------------------
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public CommonResult customerBlockHandler() {
        return new CommonResult(200, "自定义限流", new Payment(2020L, "serial003"));
    }


}
