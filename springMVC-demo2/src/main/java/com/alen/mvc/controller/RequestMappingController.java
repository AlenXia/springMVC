package com.alen.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xzy
 * @date 2022/10/9 16:57
 */
@Controller
//@RequestMapping("hello")
public class RequestMappingController {
    @RequestMapping(
            value = {"/testRequestMapping", "/test"},
            method= {RequestMethod.GET,RequestMethod.POST})
    public String success() {
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping(){
        return "success";
    }

    @RequestMapping(
            value = "/testParamsAndHeaders",
            params = {"username"}
    )
    public String testParamsAndHeaders(){
        return "success";
    }
}
