package com.info.spring.model;

import com.info.spring.common.Erole;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class RoleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Erole name;

    public RoleModel() {
        super();
    }

    public RoleModel(Erole name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Erole getName() {
        return name;
    }

    public void setName(Erole name) {
        this.name = name;
    }
}
