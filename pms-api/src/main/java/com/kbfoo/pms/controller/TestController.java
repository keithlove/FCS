/**
 * Copyright (c) 2016, 59store. All rights reserved.
 */
package com.kbfoo.pms.controller;

import com.kbfoo.pms.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author <a href="mailto:zhangwangy@59store.com">阿勇</a>
 * @version 1.0 16/1/18
 * @since 1.0
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        testService.test();
        return "test success !";
    }
}
