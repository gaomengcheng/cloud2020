package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author GMC
 * @Description
 * @date 2020/9/25  14:22
 * @return
 */

//引入lombok，get和set方法，还有构造器就可以用注解来写

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;

}
