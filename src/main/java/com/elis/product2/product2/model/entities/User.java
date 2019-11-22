package com.elis.product2.product2.model.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "u_user")
public class User implements Serializable {
    private static final long serialVersionUID = 8520121316536006169L;

    public static final String SEQ = "u_user_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ)
    @SequenceGenerator(name = SEQ, sequenceName = SEQ, initialValue = 100, allocationSize = 999999)
    private Long id;
    @Column(name = "full_name", length = 64, nullable = false)
    private String fullName;
    @Column(name = "email",nullable = false, unique = true)
    private String email;
    private String address;
    @Column(name = "Dept_Id", nullable = false)
    private Long deptId;
    @Column(name = "role_id", nullable = false)
    private Long roleId;
    @Column(name = "created_date", nullable = false)
    private Instant createdDate;
    @Column(name = "creator_id", nullable = false)
    private Long creator_id;
    @Column(name = "updated_date")
    private Instant updatedDate;
    @Column(name = "updater_id")
    private Long updaterId;

}
