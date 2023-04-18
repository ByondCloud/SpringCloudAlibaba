package com.cloud.mapper;

import com.cloud.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author KK
* @description 针对表【t_storage】的数据库操作Mapper
* @createDate 2023-04-17 09:58:17
* @Entity com.cloud.entity.Storage
*/
@Mapper
public interface StorageMapper {

    void decrease(@Param("productId") Long productId,
                  @Param("count") Integer count);


}




