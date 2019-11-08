package com.elis.product2.product2.model.dtos.product.find;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class GetProductDetailsDto implements Serializable {
    private static final long serialVersionUID = -4250013409079016487L;

    private long id;
    private LocalDateTime createdDate;
    private String name;
}
