package com.elis.product2.product2;

import com.elis.product2.product2.controllers.ProductController;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

@SpringBootTest
class Product2ApplicationTests {

    @Autowired
    private ProductController c;
    @Autowired
    private EntityManager em;

    @BeforeEach
    void setUp() {

    }

    @Test
    void contextLoads() {
    }

    @Test
    void getProductDetails() {
        c.getProductDetails(1L);
    }
}
