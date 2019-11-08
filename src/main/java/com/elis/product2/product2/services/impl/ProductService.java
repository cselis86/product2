package com.elis.product2.product2.services.impl;

import com.elis.product2.product2.model.dtos.product.find.GetProductDetailsDto;
import com.elis.product2.product2.model.entities.QProduct;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static com.elis.product2.product2.model.entities.QProduct.product;

@Service
@AllArgsConstructor
public class ProductService   {

    private EntityManager em;
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

}
