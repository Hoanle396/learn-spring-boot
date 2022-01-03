package com.info.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SkillModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String exp;
    private String logo;
    private String description;
    private String project;

    public SkillModel() {
        super();
    }

    public SkillModel( String name, String exp, String logo, String description, String project) {
        this.name = name;
        this.exp = exp;
        this.logo = logo;
        this.description = description;
        this.project = project;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "SkillModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", exp='" + exp + '\'' +
                ", logo='" + logo + '\'' +
                ", description='" + description + '\'' +
                ", project='" + project + '\'' +
                '}';
    }
}
