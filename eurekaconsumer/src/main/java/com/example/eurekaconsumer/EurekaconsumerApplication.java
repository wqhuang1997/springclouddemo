package com.example.eurekaconsumer;

import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCacheAspect;
import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class EurekaconsumerApplication {

//    @Bean
//    public HystrixCommandAspect hystrixCommandAspect() {
//        return new HystrixCommandAspect();
//    }
//
//    @Bean
//    public HystrixCacheAspect hystrixCacheAspect() {
//        return new HystrixCacheAspect();    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaconsumerApplication.class, args);
    }

}
