package com.alen.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xzy
 * @date 2022/10/9 16:45
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index() {
        return "test_param";
    }
}
