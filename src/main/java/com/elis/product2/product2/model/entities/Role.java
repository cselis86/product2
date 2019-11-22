package com.elis.product2.product2.model.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Role implements Serializable {
    private static final long serialVersionUID = -6246184375339758335L;

    private static final String SEQ = "u_role";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ)
    @SequenceGenerator(name = SEQ, sequenceName = SEQ, initialValue = 100, allocationSize = 9999)
    private Integer id;

    private String name;


}
