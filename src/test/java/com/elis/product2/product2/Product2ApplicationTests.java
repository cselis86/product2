package com.elis.product2.product2;

import com.elis.product2.product2.controllers.ProductController;
import com.elis.product2.product2.model.dtos.product.create.CreateProductRec;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
public class Product2ApplicationTests {

    @Autowired
    private ProductController c;
    @Autowired
    private EntityManager em;


    @Before
    public void setUp() {

    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void getProductDetailsTest() {
        c.getProductDetails(1L);
    }


    @Test
    public void createProductTest() {
        CreateProductRec p = new CreateProductRec();
        p.setName("polo");
        c.createProduct(p);
    }

}
