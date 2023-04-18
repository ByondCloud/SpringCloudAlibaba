package com.cloud.service.impl;

import com.cloud.mapper.StorageMapper;
import com.cloud.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/17
 * @Time 10:23
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        storageMapper.decrease(productId, count);
    }
}
