package com.ljh.springcloud.dao;

import com.ljh.springcloud.entity.PayMent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Liu.jihong
 * @Date: 2020/7/24 14:46
 */
@Mapper
public interface PayMentDao {
    int creat(PayMent payMent);

    PayMent getPayMentById(@Param("id") int id);
}
