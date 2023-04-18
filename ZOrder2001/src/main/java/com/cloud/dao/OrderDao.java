package com.cloud.dao;

import com.cloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/16
 * @Time 20:54
 */
@Mapper
public interface OrderDao {

    // 新建订单
    void create(Order order);


    // 修改订单状态
    void update(@Param("userId") Long id,
                @Param("status") Integer status);



}
