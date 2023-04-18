package com.cloud.service.impl;

import com.cloud.mapper.AccountMapper;
import com.cloud.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/17
 * @Time 10:50
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountMapper.decrease(userId, money);
    }
}
