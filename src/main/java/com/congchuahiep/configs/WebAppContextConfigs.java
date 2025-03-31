/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.congchuahiep.configs;

import com.congchuahiep.formatters.CategoryFormatter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author admin
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = {
        "com.congchuahiep.controllers",
        "com.congchuahiep.services",
        "com.congchuahiep.repositories",
})
public class WebAppContextConfigs implements WebMvcConfigurer {


    /**
     * Này không biết dùng làm gì hết
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * Đăng ký các formatter
     * <a href="https://congchuahieplearn.notion.site/Formatter-1c7a013631af8067a4afe8becffb1c29?pvs=4">Tìm hiểu thêm</a>
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new CategoryFormatter());
    }
}
