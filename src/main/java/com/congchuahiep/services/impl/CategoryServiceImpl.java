/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.congchuahiep.services.impl;

import com.congchuahiep.pojo.Category;
import com.congchuahiep.repositories.CategoryRepository;
import com.congchuahiep.services.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    
    private final CategoryRepository cateRepository;

    public CategoryServiceImpl(CategoryRepository cateRepository) {
        this.cateRepository = cateRepository;
    }

    @Override
    public List<Category> getCates() {
        return this.cateRepository.getCates();
    }
    
}
