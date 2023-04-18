package com.cloud;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/17
 * @Time 13:23
 */
public class test {
    public static void main(String[] args) {

        long workId = 0;

        try{
            // 获取本机机器id，最好用try catch包起来
            // 因为有可能会获取失败
            workId = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());

        } catch(Exception e) {
            e.printStackTrace();
            workId = NetUtil.getLocalhostStr().hashCode();
        }
        System.out.println(workId);

        Snowflake snowflake = IdUtil.getSnowflake(31,31);
        long l = snowflake.nextId();
        System.out.println(l);


    }
}
