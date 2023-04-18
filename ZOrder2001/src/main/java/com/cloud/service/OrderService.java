package com.cloud.service;

import com.cloud.entity.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/16
 * @Time 21:55
 */
public interface OrderService {
    // 新建订单
    void create(Order order);


    // 修改订单状态
    void update(Long id, Integer status);
}
