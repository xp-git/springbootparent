package com.carlyle.springbootconsumer.web;


import com.alibaba.dubbo.config.annotation.Reference;
import com.carlyle.springbootdubbo.web.service.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Carlyle on 2018/10/25.
 */
@RestController
@RequestMapping("/dubbo")
public class DubboController {

//    @Resource
    @Reference
    DubboService dubboService;

    @RequestMapping("sayHello")
    public void sayHello() {
        System.out.println("dubbo开始调用"+dubboService);
//        dubboService.sayHello("consumer 请求服务");
        dubboService.sayHello("consumer 请求服务");
    }


}
