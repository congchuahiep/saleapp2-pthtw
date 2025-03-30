/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.congchuahiep.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller này là trang chủ
 * @author admin
 */
@Controller
public class IndexController {
    
    /**
     * Endpoint cho request "/"
     * 
     * - Trả về trang index.html
     * @param model
     * @return 
     */
    @RequestMapping("/")
    public String index(Model model) {
        
        model.addAttribute("msg", "Đẹp trai không bao giờ sai");
        return "index";
    }
}
