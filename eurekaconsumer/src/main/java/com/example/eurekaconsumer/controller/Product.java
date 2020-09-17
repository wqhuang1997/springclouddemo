package com.example.eurekaconsumer.controller;

import com.example.eurekaconsumer.Interface.IProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/products")
public class Product {

    @Autowired
    private IProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public List<com.example.common.entity.Product> list() {
        return productService.findAll();
    }

    @RequestMapping(value = "/{itemCode}", method = RequestMethod.GET)
    public com.example.common.entity.Product detail(@PathVariable String itemCode) {
        return productService.getByItemCode(itemCode);
    }

    @RequestMapping(value = "/getPort", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "fail",
            commandProperties = {
            @HystrixProperty(name = "hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds", value = "6000")})
    public String getPort() {
        String port = productService.getPort();
        System.out.println(port);
        return port;
    }

    public String fail() {
        return "fail";

    }}
