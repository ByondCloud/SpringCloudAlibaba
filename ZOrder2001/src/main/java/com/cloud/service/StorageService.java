package com.cloud.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/17
 * @Time 10:02
 */
@FeignClient("seata-storage-service")
public interface StorageService {


    @GetMapping("/storage/decrease")
    void decrease(@RequestParam("productId") Long productId,
                  @RequestParam("count") Integer count);
}
