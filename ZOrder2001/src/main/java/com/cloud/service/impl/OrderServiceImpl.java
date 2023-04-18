package com.cloud.service.impl;

import com.cloud.dao.OrderDao;
import com.cloud.entity.Order;
import com.cloud.service.AccountService;
import com.cloud.service.OrderService;
import com.cloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/16
 * @Time 21:55
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;

    @Override
    @GlobalTransactional
    public void create(Order order) {
        // 创建订单
        orderDao.create(order);
        // 库存做扣减
        storageService.decrease(order.getProductId(), order.getCount());
        // 用户扣钱
        accountService.decrease(order.getUserId(), order.getMoney());
        // 修改订单状态
        orderDao.update(order.getId(), 0);
        // 下单
    }

    @Override
    public void update(Long id, Integer status) {
        // 修改订单
        orderDao.update(id, status);
    }
}
