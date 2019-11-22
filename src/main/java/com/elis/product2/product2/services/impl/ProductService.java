package com.elis.product2.product2.services.impl;

import com.elis.product2.product2.model.dtos.product.create.CreateProductRec;
import com.elis.product2.product2.model.dtos.product.find.GetProductDetailsDto;
import com.elis.product2.product2.model.entities.Product;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static com.elis.product2.product2.model.entities.QProduct.product;
import static java.time.LocalDateTime.now;

@Service
public class ProductService   {

    @Autowired
    private EntityManager em;
    @Autowired
    private JPAQueryFactory jpaQuery;

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }

    public GetProductDetailsDto getProductById(Long id) {

        GetProductDetailsDto resp = jpaQuery.select(Projections.bean(GetProductDetailsDto.class,
                product.id,
                product.createdDate,
                product.name
        ))
                .from(product).where(product.id.eq(id)).fetchFirst();

        return resp;
    }


    public Long createProduct(CreateProductRec p) {

        Product product = new Product();

        product.setName(p.getName());
        product.setCreatedDate(now());

        em.persist(product);

        return 1L;
    }
}
