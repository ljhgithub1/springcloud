package com.ljh.springcloud.service;

import com.ljh.springcloud.entity.PayMent;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Liu.jihong
 * @Date: 2020/7/24 15:04
 */
public interface PayMentService {
    int creat(PayMent payMent);

    PayMent getPayMentById(@Param("id") int id);
}
