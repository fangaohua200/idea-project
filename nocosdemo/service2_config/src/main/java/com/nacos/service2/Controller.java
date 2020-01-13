package com.nacos.service2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${common.name}")
    private String name;

    @GetMapping("/config")
    public String getConfig(){
        return name;

    }
}
