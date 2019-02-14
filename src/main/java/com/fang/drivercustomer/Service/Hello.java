package com.fang.drivercustomer.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("driverprovider")
public interface Hello {

    @GetMapping("hellofirst.do")
    public String h1();
}
