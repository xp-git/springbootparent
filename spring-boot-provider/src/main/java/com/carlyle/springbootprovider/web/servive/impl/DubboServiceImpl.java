package com.carlyle.springbootprovider.web.servive.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.carlyle.springbootdubbo.web.service.DubboService;
import org.springframework.stereotype.Component;


/**
 * Created by Carlyle on 2018/10/25.
 */
@Service(interfaceClass = DubboService.class)
@Component
public class DubboServiceImpl implements DubboService {
    @Override
    public void sayHello(String name) {
        System.out.println("请求过来了");
        System.out.println(name);
        System.out.println("---dubbo 发布服务----");
    }
}
