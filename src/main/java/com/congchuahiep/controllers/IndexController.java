/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.congchuahiep.controllers;

import com.congchuahiep.repositories.ProductRespository;
import com.congchuahiep.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller này là trang chủ
 * @author admin
 */
@Controller
public class IndexController {
    
    private final CategoryService categoryService;
    private final ProductRespository productRespository;

    public IndexController(CategoryService categoryService, ProductRespository productRespository) {
        this.categoryService = categoryService;
        this.productRespository = productRespository;
    }

    /**
     * Endpoint cho request "/"
     * <br>
     * - Trả về trang index.html hiển thị thông tin của các mặt hàng trong website
     */
    @RequestMapping("/")
    public String index(Model model) {
        
        model.addAttribute("categories", this.categoryService.getCates());
        model.addAttribute("products", this.productRespository.getProducts(null));
        
        model.addAttribute("msg", "Đẹp trai không bao giờ sai");
        return "index.html";
    }
}
