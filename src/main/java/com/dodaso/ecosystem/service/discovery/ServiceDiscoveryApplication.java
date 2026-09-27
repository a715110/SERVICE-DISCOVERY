package com.dodaso.ecosystem.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * dodaso service registry. Every service and UI of one customer instance registers
 * here and discovers the others through it. One registry per customer instance.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ServiceDiscoveryApplication.class, args);
    }
}
