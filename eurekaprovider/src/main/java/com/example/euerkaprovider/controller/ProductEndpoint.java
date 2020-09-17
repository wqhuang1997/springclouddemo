package com.example.euerkaprovider.controller;

import com.example.common.entity.Product;
import com.netflix.appinfo.EurekaInstanceConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/products")
public class ProductEndpoint{

    @Autowired
    private EurekaInstanceConfig eurekaInstanceConfig;

    protected List<Product> buildProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("item-1", "测试商品-1", "TwoStepsFromJava", 100));
        products.add(new Product("item-2", "测试商品-2", "TwoStepsFromJava", 200));
        products.add(new Product("item-3", "测试商品-3", "TwoStepsFromJava", 300));
        products.add(new Product("item-4", "测试商品-4", "TwoStepsFromJava", 400));
        products.add(new Product("item-5", "测试商品-5", "TwoStepsFromJava", 500));
        products.add(new Product("item-6", "测试商品-6", "TwoStepsFromJava", 600));
        return products;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> findAll() {
        log.info("url:{}", eurekaInstanceConfig.getInstanceId());
        return buildProducts();
    }

    @RequestMapping(value = "/{itemCode}", method = RequestMethod.GET)
    public Product getByItemCode(@PathVariable("itemCode") String itemCode) {
        for (Product product : buildProducts()) {
            if (product.getItemCode().equalsIgnoreCase(itemCode)) {
                return product;
            }
        }
        return null;
    }

    @RequestMapping(value = "/getPort", method = RequestMethod.GET)
    public String getPort() {
        String instanceId = eurekaInstanceConfig.getInstanceId();
        return "port: " + instanceId;
    }
}
