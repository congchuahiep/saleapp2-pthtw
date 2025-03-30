/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.congchuahiep.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author admin
 */
public class DispatcherServerletInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Này chịu, không biết
     * @return 
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
            ThymeleafConfig.class
        };
    }

    /**
     * Chọn class làm IoC
     * @return 
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
            WebAppContextConfigs.class
        };
    }

    /**
     * Vị trí endpoint đầu tiên mặc định
     * @return 
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
    
}
