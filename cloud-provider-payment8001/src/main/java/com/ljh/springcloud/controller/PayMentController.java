package com.ljh.springcloud.controller;

import com.ljh.springcloud.entity.PayMent;
import com.ljh.springcloud.service.PayMentService;
import com.ljh.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Liu.jihong
 * @Date: 2020/7/24 15:07
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PayMentController {
    @Autowired
    private PayMentService payMentService;

    @PostMapping("/creat")
    public CommonResult creat(@RequestBody PayMent payMent){
        int creat = payMentService.creat(payMent);
        log.info("插入结果--->"+creat);
        if(creat>0){
            return new CommonResult(200,"插入数据成功",creat);
        }
        return new CommonResult(500,"查询失败");
    }
    @GetMapping("/get/{id}")
    public CommonResult geyById(@PathVariable("id") int id){
        PayMent payMentById = payMentService.getPayMentById(id);
        if(payMentById!=null){
            return new CommonResult(200,"查询成功，并且有结果",payMentById);
        }
        return new CommonResult(201,"没有查到相关数据");
    }
}
