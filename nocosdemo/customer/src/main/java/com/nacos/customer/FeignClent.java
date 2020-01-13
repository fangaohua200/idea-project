package com.nacos.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider")
public interface FeignClent {
    @GetMapping("/service")

    public String getConfig();
}
