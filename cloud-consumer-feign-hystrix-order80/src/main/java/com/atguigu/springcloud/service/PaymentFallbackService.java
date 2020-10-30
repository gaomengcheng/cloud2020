package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author GMC
 * @Description
 * @date 2020/9/27  16:14
 * @return
 */

@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }

}
