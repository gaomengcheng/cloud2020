package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author GMC
 * @Description
 * @date 2020/9/29  8:52
 * @return
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
//@EnableEurekaClient(client端可以不用写@EnableEurekaClient注解，在configration中已经配置)
public class ConfigCenterMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}
