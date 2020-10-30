package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.AccountService;
import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GMC
 * @Description
 * @date 2020/10/11  10:04
 * @return
 */

@Service
@Slf4j
public class OrderServiceImpl implements OrderService{

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;


    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("----------开始新建订单");
        orderDao.create(order);

        log.info("-----------订单微服务开始调用库存，做扣减count");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("-----------订单微服务开始调用库存，做扣减end");

        log.info("-----------订单微服务开始调用账户，做扣减money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("-----------订单微服务开始调用账户，做扣减end");

        //修改订单状态，1表示完成
        log.info("--------修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("--------修改订单状态结束");

        log.info("----------ok了");
    }
}
