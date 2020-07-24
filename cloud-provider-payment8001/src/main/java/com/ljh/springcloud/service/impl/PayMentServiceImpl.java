package com.ljh.springcloud.service.impl;

import com.ljh.springcloud.dao.PayMentDao;
import com.ljh.springcloud.entity.PayMent;
import com.ljh.springcloud.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Liu.jihong
 * @Date: 2020/7/24 15:05
 */
@Service
public class PayMentServiceImpl implements PayMentService {
    @Autowired
    private PayMentDao payMentDao;
    @Override
    public int creat(PayMent payMent) {
        return payMentDao.creat(payMent);
    }

    @Override
    public PayMent getPayMentById(int id) {
        return payMentDao.getPayMentById(id);
    }
}
