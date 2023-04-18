package com.cloud.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/17
 * @Time 10:47
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);

}
