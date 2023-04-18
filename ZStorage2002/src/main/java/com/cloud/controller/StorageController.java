package com.cloud.controller;

import com.cloud.entity.CommonResult;
import com.cloud.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/17
 * @Time 10:28
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @GetMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功");
    }

}
