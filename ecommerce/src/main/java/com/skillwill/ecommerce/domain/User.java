package com.skillwill.ecommerce.domain;

public class User {
    private Long id;
    private String username;
    private double balance;

    public User() {
    }

    public User(Long id, String username, double balance) {
        this.id = id;
        this.username = username;
        this.balance = balance;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {

        User user = new User(1L, "Jack", 1000.0);

        System.out.println("Username: " + user.getUsername());
        System.out.println("Initial Balance: $" + user.getBalance());
    }
}
