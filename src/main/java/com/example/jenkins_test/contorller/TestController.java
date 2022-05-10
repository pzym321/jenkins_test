package com.example.jenkins_test.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Pang ZhengYanMing
 * @Date: 2022/05/10/11:05
 * @Description:
 */
@RestController
public class TestController {
    @RequestMapping("test")
    public String data(){
        System.out.println("----------test----------");
        return "hello,Jenkins";
    }
}
