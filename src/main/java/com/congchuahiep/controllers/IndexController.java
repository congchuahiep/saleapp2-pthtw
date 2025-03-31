/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.congchuahiep.controllers;

import com.congchuahiep.repositories.ProductRespository;
import com.congchuahiep.services.CategoryService;
import com.congchuahiep.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller này là trang chủ
 * @author admin
 */
@Controller
@ControllerAdvice
public class IndexController {
    
    private final CategoryService categoryService;
    private final ProductService productService;

    public IndexController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    /**
     * Các attribute ở đây sẽ cho phép mọi controller khác sử dụng
     */
    @ModelAttribute
    public void commonResponses(Model model) {
        model.addAttribute("categories", this.categoryService.getCates());
    }

    /**
     * Endpoint cho request "/"
     * <br>
     * - Trả về trang index.html hiển thị thông tin của các mặt hàng trong website
     */
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("products", this.productService.getProducts(null));

        return "index.html";
    }
}
