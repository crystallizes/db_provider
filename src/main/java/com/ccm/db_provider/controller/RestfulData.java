package com.ccm.db_provider.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/apiv1")
public class RestfulData {

    @GetMapping(produces="application/json;charset =UTF-8")
    public void getInfo(){
        System.out.println("get info 获取");
    }
    @PutMapping(produces="application/json;charset =UTF-8")
    public void putInfo(){
        System.out.println("put info");
    }
    @PostMapping(produces="application/json;charset =UTF-8")
    public void postInfo(){
        System.out.println("post info");
    }
    @DeleteMapping(produces="application/json;charset =UTF-8")
    public void deleteInfo(){
        System.out.println("delete info");
    }
}
