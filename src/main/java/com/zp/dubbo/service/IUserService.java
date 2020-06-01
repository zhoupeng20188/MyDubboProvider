package com.zp.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zp.dubbo.IUserInterface;
import org.springframework.stereotype.Component;

/**
 * @Author zp
 * @create 2020/6/1 16:26
 */
@Component
@Service(interfaceClass = IUserInterface.class)
public class IUserService implements IUserInterface {
    @Override
    public String sayHello(String name) {
        return "hello:"+name;
    }
}
