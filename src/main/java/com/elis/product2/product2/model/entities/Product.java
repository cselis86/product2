package com.elis.product2.product2.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "p_product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product implements Serializable {
    private static final long serialVersionUID = 4779548406210334056L;

    public static final String SEQ = "p_PRODUCT_SEQ";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = SEQ)
    @SequenceGenerator(name = SEQ, sequenceName = SEQ)
    private long id;
    private String name;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
}
