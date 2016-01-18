/**
 * Copyright (c) 2016, 59store. All rights reserved.
 */
package com.kbfoo.pms.service.impl;

import com.kbfoo.pms.service.TestService;
import org.springframework.stereotype.Service;

/**
 *
 * @author <a href="mailto:zhangwangy@59store.com">阿勇</a>
 * @version 1.0 16/1/18
 * @since 1.0
 */
@Service("testService")
public class TestServiceImpl implements TestService{
    @Override
    public String test() {
        System.out.println("service test success!");
        return "service test success";
    }
}
