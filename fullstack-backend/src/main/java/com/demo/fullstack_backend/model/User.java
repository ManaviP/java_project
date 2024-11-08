package com.demo.fullstack_backend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String product;
    private String quantity;

    // Getters and setters

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

    public String getName() {
        return product;
    }

    public void setName(String product) {
        this.product = product;
    }

    public String getEmail() {
        return quantity;
    }

    public void setEmail(String quantity) {
        this.quantity = quantity;
    }
}
