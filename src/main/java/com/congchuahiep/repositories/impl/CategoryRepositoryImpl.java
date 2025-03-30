package com.congchuahiep.repositories.impl;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.thh.repositories.impl;
//
//import com.thh.pojo.Category;
//import com.thh.saleapp.HibernateUtils;
//import org.hibernate.query.Query;
//import org.hibernate.Session;
//
//import java.util.List;
//
///**
// *
// * @author admin
// */
//public class CategoryRepositoryImpl {
//    public List<Category> getCates() {
//        try (Session s = HibernateUtils.getFACTORY().openSession()) {
//            Query<Category> q = s.createQuery("FROM Category", Category.class);
//            
//            return q.getResultList();
//        }
//    }
//}
