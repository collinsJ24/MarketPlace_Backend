package com.ie.james.marketplace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gallery")
public class Image {

    private static final long serialVersionUID = 5313593413859894403L;


    @Id
    @Column(nullable=false)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String image;

    public String getImage() {
        return image;
    }
}
