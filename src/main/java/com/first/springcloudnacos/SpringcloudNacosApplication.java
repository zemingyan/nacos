package com.first.springcloudnacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudNacosApplication.class, args);
    }

}
