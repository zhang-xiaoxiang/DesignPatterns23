package com.demo.strategy;

/**
 * VIP1Strategy: 一级会员策略
 *
 * @author zhangxiaoxiang
 * @date 2019/5/24
 */
public class VIP1Strategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("一级会员 打九折："+standardPrice * 0.9);
        return standardPrice * 0.9;
    }

}
