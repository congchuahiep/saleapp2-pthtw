package com.congchuahiep.repositories.impl;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.thh.repositories.impl;
//
//import com.thh.pojo.OrderDetail;
//import com.thh.pojo.Product;
//import com.thh.saleapp.HibernateUtils;
//import jakarta.persistence.criteria.*;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//
//import java.util.List;
//
///**
// *
// * @author admin
// */
//public class StatsRepositoryImpl {
//    public List<Object[]> statsRevenueByProduct() {
//        try (Session s = HibernateUtils.getFACTORY().openSession()) {
//            CriteriaBuilder b = s.getCriteriaBuilder();
//            CriteriaQuery<Object[]> q = b.createQuery(Object[].class);
//            Root<OrderDetail> root = q.from(OrderDetail.class);
//            Join<OrderDetail, Product> join = root.join("productId", JoinType.RIGHT);
//            
//            q.multiselect(
//                    join.get("id"), 
//                    join.get("name"),
//                    b.sum(b.prod(root.get("unitPrice"), root.get("quantity")))
//            );
//            
//            q.groupBy(join.get("id"));
//            
//            Query<Object[]> query = s.createQuery(q);
//            return query.getResultList();
//        }
//    }
//}
