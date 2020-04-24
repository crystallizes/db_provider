package com.ccm.db_provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public Map<String, Object> index(){
        System.out.println("热部署1");
        Map<String,Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",67);
        System.out.println("333");
        System.out.println("456");
        return map;
    }
}