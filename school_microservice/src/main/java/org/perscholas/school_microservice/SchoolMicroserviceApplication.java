package org.perscholas.school_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SchoolMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolMicroserviceApplication.class, args);
    }

}
