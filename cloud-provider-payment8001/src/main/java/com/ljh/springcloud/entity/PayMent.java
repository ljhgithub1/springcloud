package com.ljh.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Liu.jihong
 * @Date: 2020/7/24 14:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayMent implements Serializable {
    private int id;
    private String serial;
}
