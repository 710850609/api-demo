package org.linbo.demo.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("org.linbo.demo.api.mapper")
public class ApiDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApiDemoApplication.class, args);
    }

    @Autowired
    Environment environment;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("本地访问： http://localhost:" + environment.getProperty("local.server.port"));
    }
}
