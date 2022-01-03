package com.info.spring.model;

import javax.persistence.*;

@Entity
public class info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String avatar;
    private String deginer;
    private String facebook;
    private String gmail;
    private String phonenumber;
    @Lob
    @Column(name="DESCRIPTION", length=1024)
    private String description;
    public info() {
    }

    public info( String name, String avatar, String deginer, String facebook, String gmail, String phonenumber, String description) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.deginer = deginer;
        this.facebook = facebook;
        this.gmail = gmail;
        this.phonenumber = phonenumber;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDeginer() {
        return deginer;
    }

    public void setDeginer(String deginer) {
        this.deginer = deginer;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", deginer='" + deginer + '\'' +
                ", facebook='" + facebook + '\'' +
                ", gmail='" + gmail + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
