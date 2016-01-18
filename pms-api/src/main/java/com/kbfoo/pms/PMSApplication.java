/**
 * Copyright (c) 2016, 59store. All rights reserved.
 */
package com.kbfoo.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 *
 * @author <a href="mailto:zhangwangy@59store.com">阿勇</a>
 * @version 1.0 16/1/18
 * @since 1.0
 */
@SpringBootApplication
public class PMSApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PMSApplication.class, args);
    }
}
