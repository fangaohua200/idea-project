package com.nacos.application1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //此处需要注入 service  基于duuble协议

    @GetMapping("/service")
    public String getConfig() {
      return " is from provider";

    }
//    @Autowired
//    ConfigurableApplicationContext applicationContext;
//
//    @GetMapping("/config_new")
//    public String getConfig1(){
//        return applicationContext.getEnvironment().getProperty("common.name");
//    }

}
