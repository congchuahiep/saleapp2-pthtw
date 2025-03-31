package com.congchuahiep.services;

import com.congchuahiep.pojo.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Product> getProducts(Map<String, String> params);
    Product getProductById(int id);
    Product addOrUpdate(Product p);
    void deleteProduct(int id);
}
