package org.perscholas.microserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceoneApplication.class, args);
    }

}
