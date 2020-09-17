package com.example.euerkaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EuerkaProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EuerkaProviderApplication.class, args);
    }
}
