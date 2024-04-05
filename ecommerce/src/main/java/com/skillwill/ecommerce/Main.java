package com.skillwill.ecommerce;

import com.skillwill.ecommerce.domain.Order;
import com.skillwill.ecommerce.domain.Product;
import com.skillwill.ecommerce.domain.User;

public class Main {
        User user1 = new User();
        user1.setId(1L);
        user1.setUsername("Jack");
        user1.setBalance(1000.0);

        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Jeans");
        product1.setPrice(45,99);
        product1.setQuantity(10);

        Order order1 = new Order();
        order1.setId(1L);
        order1.setUser(user1);
        order1.setProduct(product1);
        order1.setQuantity(1);


        System.out.println("User: " + user1.getUsername() + " has balance: $" + user1.getBalance());
        System.out.println("Product: " + product1.getName() + " has quantity: " + product1.getQuantity());


        user1.setBalance(user1.getBalance() - (product1.getPrice() * order1.getQuantity()));
        product1.setQuantity(product1.getQuantity() - order1.getQuantity());

        System.out.println("After ordering:");
        System.out.println("User: " + user1.getUsername() + " has balance: $" + user1.getBalance());
        System.out.println("Product: " + product1.getName() + " has quantity: " + product1.getQuantity());
    }




