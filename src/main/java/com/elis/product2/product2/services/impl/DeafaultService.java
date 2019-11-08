package com.elis.product2.product2.services.impl;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

public class DeafaultService {

    protected EntityManager em;

    @PostConstruct
    public void setEm(EntityManager em){
        this.em = em;
    }
}
