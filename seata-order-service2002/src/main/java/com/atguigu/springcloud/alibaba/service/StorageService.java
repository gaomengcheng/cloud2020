package com.atguigu.springcloud.alibaba.service;

/**
 * @author GMC
 * @Description
 * @date 2020/10/11  11:12
 * @return
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);

}
