package com.cloud.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/17
 * @Time 10:22
 */
public interface StorageService {

    void decrease(Long productId, Integer count);

}
