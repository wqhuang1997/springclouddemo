package com.example.eurekaconsumer.fallback;

import com.example.common.entity.Product;
import com.example.eurekaconsumer.Interface.IProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceFallbackFactory implements FallbackFactory<IProductService> {
    @Override
    public IProductService create(Throwable throwable) {
        return new IProductService() {
            @Override
            public List<Product> findAll() {
                return null;
            }

            @Override
            public Product getByItemCode(String itemCode) {
                return null;
            }

            @Override
            public String getPort() {
                return "factory error";
            }
        };
    }
}
