package com.congchuahiep.controllers;


import com.congchuahiep.pojo.Product;
import com.congchuahiep.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Mở form điền dữ liệu để tạo một Product mới
     */
    @RequestMapping("/products")
    public String productView(Model model) {
        model.addAttribute("product", new Product());
        return "products";
    }

    @RequestMapping("/products/add")
    public String productAdd(@ModelAttribute(value = "product") Product product) {
        this.productService.addOrUpdate(product);
        return "redirect:/";
    }

    @RequestMapping("products/{productId}")
    public String productView(Model model, @PathVariable(value = "productId") int id) {
        model.addAttribute("product", this.productService.getProductById(id));
        return "products";
    }
}
