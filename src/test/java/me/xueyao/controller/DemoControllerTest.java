package me.xueyao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import me.xueyao.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Simon.Xue
 * @date 1/5/21 4:36 PM
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoControllerTest {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @Test
    public void testConsumer() {
        System.out.println(demoService.sayHello("小明"));
    }
}
