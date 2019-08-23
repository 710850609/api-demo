package org.linbo.demo.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.linbo.demo.api.mapper.UserMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiDemoApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
//        List<Map<String, String>> test = userMapper.getTest();
//        System.out.println(Arrays.toString(test.toArray()));
    }

}
