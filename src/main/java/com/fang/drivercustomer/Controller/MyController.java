package com.fang.drivercustomer.Controller;

import com.fang.drivercustomer.Service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : zcg
 * @Data ：Create in 19:132019/2/14
 */
@RestController
public class MyController {

    @Autowired
    private Hello hello;

    @GetMapping("hello.do")
    public String Hello2() {
        return hello.h1();
    }
}
