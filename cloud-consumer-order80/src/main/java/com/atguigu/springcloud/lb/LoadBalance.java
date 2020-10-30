package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author GMC
 * @Description
 * @date 2020/9/26  21:46
 * @return
 */

public interface LoadBalance{

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
