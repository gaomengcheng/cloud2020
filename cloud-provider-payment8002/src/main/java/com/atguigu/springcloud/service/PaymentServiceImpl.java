package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GMC
 * @Description
 * @date 2020/9/25  14:54
 * @return
 */
@Service
public class PaymentServiceImpl implements PaymentService {

//    @Autowired  springboot的自动注入    两个功能一样
    @Resource   //java的自动注入
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
