package com.skillwill.ecommerce.domain;

public class Admin {

    private Long id;
    private String username;
    private String password;
    public Admin() {
    }

    public Admin(Long id, String username, double balance) {
        this.id = id;
        this.username = username;
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
}

