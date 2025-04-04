package com.congchuahiep.repositories.impl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.congchuahiep.pojo.Category;
import org.hibernate.query.Query;
import org.hibernate.Session;

import java.util.List;

import com.congchuahiep.repositories.CategoryRepository;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository {
    private final LocalSessionFactoryBean factory;

    public CategoryRepositoryImpl(LocalSessionFactoryBean factory) {
        this.factory = factory;
    }

    @Override
    public List<Category> getCates() {
        Session s = this.factory.getObject().getCurrentSession();
        Query<Category> q = s.createQuery("FROM Category", Category.class);

        return q.getResultList();
    }
}
