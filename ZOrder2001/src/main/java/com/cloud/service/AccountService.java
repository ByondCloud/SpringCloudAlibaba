package com.cloud.service;

import com.cloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/16
 * @Time 21:57
 */
@FeignClient("seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    void decrease(@RequestParam("userId") Long userId,
                          @RequestParam("money") BigDecimal money);




}
