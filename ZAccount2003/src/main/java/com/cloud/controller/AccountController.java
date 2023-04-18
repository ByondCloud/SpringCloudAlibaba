package com.cloud.controller;

import com.cloud.entity.CommonResult;
import com.cloud.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/17
 * @Time 10:51
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId,
                                 @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣减账户余额成功");
    }

}
