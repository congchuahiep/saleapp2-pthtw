package com.congchuahiep.repositories;

import com.congchuahiep.pojo.Product;

import java.util.List;
import java.util.Map;

public interface ProductRespository {
    List<Product> getProducts(Map<String, String> params);
    Product getProductById(int id);
    Product addOrUpdate(Product p);
    void deleteProduct(int id);
}
