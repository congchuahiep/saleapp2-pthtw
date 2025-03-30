package com.congchuahiep.repositories.impl;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.thh.repositories.impl;
//
//import com.thh.pojo.Product;
//import com.thh.saleapp.HibernateUtils;
//import jakarta.persistence.criteria.CriteriaBuilder;
//import jakarta.persistence.criteria.CriteriaQuery;
//import jakarta.persistence.criteria.Predicate;
//import jakarta.persistence.criteria.Root;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author admin
// */
//public class ProductRepositoryImpl {
//    private static final int PAGE_SIZE = 6;
//
//    public List<Product> getProducts(Map<String, String> params) {
//        try (Session s = HibernateUtils.getFACTORY().openSession()) {
//            CriteriaBuilder b = s.getCriteriaBuilder();
//            CriteriaQuery<Product> q = b.createQuery(Product.class);
//            Root<Product> root = q.from(Product.class);
//
//            q.select(root);
//
//            if (params != null) {
//
//                List<Predicate> predicates = new ArrayList<>();
//
//                String keyWord = params.get("keyWord");
//                if (keyWord != null && !keyWord.isEmpty()) {
//                    predicates.add(b.like(root.get("name"), String.format("%%%s%%", keyWord)));
//                }
//
//                String fromPrice = params.get("fromPrice");
//                if (fromPrice != null && !fromPrice.isEmpty()) {
//                    predicates.add(b.like(root.get("name"), String.format("%%%s%%", fromPrice)));
//                }
//
//                String toPrice = params.get("toPrice");
//                if (toPrice != null && !toPrice.isEmpty()) {
//                    predicates.add(b.like(root.get("name"), String.format("%%%s%%", toPrice)));
//                }
//
//                q.where(predicates.toArray(Predicate[]::new));
//
//                String sort = params.get("sort");
//                if (sort != null && !sort.isEmpty()) {
//                    q.orderBy(b.asc(root.get(sort)));
//                }
//            }
//
//            Query<Product> query = s.createQuery(q);
//
//            if (params != null) {
//                int page = Integer.parseInt(params.getOrDefault("page", "1"));
//                int start = (page - 1) * PAGE_SIZE;
//                query.setMaxResults(PAGE_SIZE);
//                query.setFirstResult(start);
//            }
//
//            return query.getResultList();
//        }
//    }
//}
