package com.cloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.math.BigDecimal;

/**
* @author KK
* @description 针对表【t_account】的数据库操作Mapper
* @createDate 2023-04-17 10:42:53
* @Entity com.cloud.entity.Account
*/
@Mapper
public interface AccountMapper {

    void decrease(@Param("userId") Long userId,
                  @Param("money") BigDecimal money);

}




