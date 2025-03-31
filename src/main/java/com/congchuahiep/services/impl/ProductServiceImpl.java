package com.congchuahiep.services.impl;

import com.congchuahiep.pojo.Category;
import com.congchuahiep.pojo.Product;
import com.congchuahiep.repositories.CategoryRepository;
import com.congchuahiep.repositories.ProductRespository;
import com.congchuahiep.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRespository productRespository;

    public ProductServiceImpl(ProductRespository productRespository) {
        this.productRespository = productRespository;
    }


    @Override
    public List<Product> getProducts(Map<String, String> params) {
        return productRespository.getProducts(params);
    }
}

