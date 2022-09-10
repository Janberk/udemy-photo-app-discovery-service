package com.cdn.udemyphotoappdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UdemyPhotoAppDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemyPhotoAppDiscoveryServiceApplication.class, args);
    }

}
