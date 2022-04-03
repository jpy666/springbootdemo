package com.bupt.springbootdemo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: 金培源
 * @Date: 2022/3/27 17:02
 * @Version: 1.0
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "user")
public class User {

}
