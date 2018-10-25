package com.carlyle.springbootprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Carlyle on 2018/10/25.
 */
@SpringBootApplication
@EnableDubboConfiguration
public class ProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(ProviderApplication.class,args);
    }
}
