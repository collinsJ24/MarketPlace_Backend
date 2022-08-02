package com.ie.james.marketplace.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 5313593413859894403L;

    @Id
    @Column(nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String username;


    private String email;


    private String password;

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User hotel = (User) o;

        if (String.compare(hotel.latitude, latitude) != 0) return false;
        if (Double.compare(hotel.longitude, longitude) != 0) return false;
        if (deleted != hotel.deleted) return false;
        if (!Objects.equals(id, hotel.id)) return false;
        if (!Objects.equals(name, hotel.name)) return false;
        if (!Objects.equals(rating, hotel.rating)) return false;
        if (!Objects.equals(city, hotel.city)) return false;
        return Objects.equals(address, hotel.address);
    } */
}