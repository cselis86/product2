package com.elis.product2.product2.model.dtos.product.create;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
public class CreateProductRec implements Serializable {
    private static final long serialVersionUID = -5147360682542685518L;

    private String name;
}
