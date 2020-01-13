package com.nacos.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private FeignClent feignClent;

    @GetMapping("/service")
    public String getConfig() {
      return feignClent.getConfig()+" is from provider";

    }
//    @Autowired
//    ConfigurableApplicationContext applicationContext;
//
//    @GetMapping("/config_new")
//    public String getConfig1(){
//        return applicationContext.getEnvironment().getProperty("common.name");
//    }
}
