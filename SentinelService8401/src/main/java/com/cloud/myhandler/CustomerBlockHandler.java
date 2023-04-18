package com.cloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.entity.CommonResult;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/16
 * @Time 16:06
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException blockException) {
        return new CommonResult(444, "自定义全局限流1");
    }

    public static CommonResult handlerException2(BlockException blockException) {
        return new CommonResult(444, "自定义全局限流2");
    }

}
