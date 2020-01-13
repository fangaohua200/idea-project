package com.nacos.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${common.name}")
    private String name;

    @GetMapping("/config1")
    public String getConfig(){
        return name;

    }
    @Autowired
    ConfigurableApplicationContext applicationContext;

    @GetMapping("/config_new")
    public String getConfig1(){
        return applicationContext.getEnvironment().getProperty("common.name");
    }
}
