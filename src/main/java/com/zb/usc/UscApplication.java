package com.zb.usc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UscApplication {

    public static void main(String[] args) {
        SpringApplication.run(UscApplication.class, args);
    }

}
