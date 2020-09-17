package com.example.eurekaconsumer.fallback;

import com.example.common.entity.Product;
import com.example.eurekaconsumer.Interface.IProductService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceError implements IProductService {
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
        return "error";
    }
}
