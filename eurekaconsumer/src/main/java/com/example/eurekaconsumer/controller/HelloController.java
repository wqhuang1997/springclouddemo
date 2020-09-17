/*
package com.example.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWord() {
        return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
    }

    @RequestMapping(value = "/helloEx", method = RequestMethod.GET)
    public String helloWordEx() {
        ServiceInstance instance = loadBalancerClient.choose("hello-service");
        URI helloUri = URI.create(String.format("http://%s:%s/hello", instance.getHost(), instance.getPort()));
        return new RestTemplate().getForEntity(helloUri, String.class).getBody();
    }
}
*/
