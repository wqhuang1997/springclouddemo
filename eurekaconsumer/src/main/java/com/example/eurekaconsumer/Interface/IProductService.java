package com.example.eurekaconsumer.Interface;

import com.example.common.entity.Product;
import com.example.eurekaconsumer.fallback.ProductServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(value = "hello-service", fallbackFactory = ProductServiceFallbackFactory.class)
public interface IProductService{

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> findAll();

    @RequestMapping(value = "/products/{itemCode}", method = RequestMethod.GET)
    Product getByItemCode(@PathVariable("itemCode") String itemCode);

    @RequestMapping(value = "/products/getPort", method = RequestMethod.GET)
    String getPort();
}
