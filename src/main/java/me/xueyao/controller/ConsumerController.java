package me.xueyao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import me.xueyao.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Simon.Xue
 * @date 1/5/21 2:51 PM
 **/
@RestController
public class ConsumerController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping("/test")
    public void test() {
        demoService.sayHello("Xiao Ming");
    }

}
