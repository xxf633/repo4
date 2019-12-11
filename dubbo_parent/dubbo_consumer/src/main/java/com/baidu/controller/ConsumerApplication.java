package com.baidu.controller;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDubbo
@DubboComponentScan("com.baidu.controller")
public class ConsumerApplication{
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
