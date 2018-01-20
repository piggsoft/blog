/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2018/1/19                           Create
 */
package com.piggsoft.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author piggsoft
 * @version 1.0
 * @create 2018/1/19
 * @since 1.0
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("weclcome", "哈哈哈");
        return "index";
    }

}
