package com.elis.product2.product2.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "p_product")
@Data
@EqualsAndHashCode
public class Product implements Serializable {
    private static final long serialVersionUID = 4779548406210334056L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
}
