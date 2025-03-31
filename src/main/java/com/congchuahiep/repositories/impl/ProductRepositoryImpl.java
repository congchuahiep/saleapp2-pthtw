package com.congchuahiep.repositories.impl;

import com.congchuahiep.pojo.Product;
import com.congchuahiep.repositories.ProductRespository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author admin
 */
@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRespository {
    private final LocalSessionFactoryBean factory;
    private static final int PAGE_SIZE = 6;

    public ProductRepositoryImpl(LocalSessionFactoryBean factory) {
        this.factory = factory;
    }

    public List<Product> getProducts(Map<String, String> params) {
        Session s = this.factory.getObject().getCurrentSession();

        CriteriaBuilder b = s.getCriteriaBuilder();
        CriteriaQuery<Product> q = b.createQuery(Product.class);
        Root<Product> root = q.from(Product.class);

        q.select(root);

        if (params != null) {

            List<Predicate> predicates = new ArrayList<>();

            String keyWord = params.get("keyWord");
            if (keyWord != null && !keyWord.isEmpty()) {
                predicates.add(b.like(root.get("name"), String.format("%%%s%%", keyWord)));
            }

            String fromPrice = params.get("fromPrice");
            if (fromPrice != null && !fromPrice.isEmpty()) {
                predicates.add(b.like(root.get("name"), String.format("%%%s%%", fromPrice)));
            }

            String toPrice = params.get("toPrice");
            if (toPrice != null && !toPrice.isEmpty()) {
                predicates.add(b.like(root.get("name"), String.format("%%%s%%", toPrice)));
            }

            q.where(predicates.toArray(Predicate[]::new));

            String sort = params.get("sort");
            if (sort != null && !sort.isEmpty()) {
                q.orderBy(b.asc(root.get(sort)));
            }
        }

        Query<Product> query = s.createQuery(q);

        if (params != null) {
            int page = Integer.parseInt(params.getOrDefault("page", "1"));
            int start = (page - 1) * PAGE_SIZE;
            query.setMaxResults(PAGE_SIZE);
            query.setFirstResult(start);
        }

        return query.getResultList();
    }
}
