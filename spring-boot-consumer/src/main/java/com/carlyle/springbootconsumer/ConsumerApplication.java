package com.carlyle.springbootconsumer;


import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Carlyle on 2018/10/25.
 */
@EnableDubboConfiguration
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
