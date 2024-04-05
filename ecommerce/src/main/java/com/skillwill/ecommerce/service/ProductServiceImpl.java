package com.skillwill.ecommerce.service;

import com.skillwill.ecommerce.domain.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

    private List<Product> productList = new ArrayList<>();

    public ProductServiceImpl() {

        productList.add(new Product(1L, "T-shirt", 20.0, 50));
        productList.add(new Product(2L, "Jeans", 50.0, 30));
        productList.add(new Product(3L, "Dress", 80.0, 20));
        productList.add(new Product(4L, "Sneakers", 60.0, 40));
        productList.add(new Product(5L, "Handbag", 100.0, 15));


        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public Product createProduct(Product product) {
        // Logic to create a new product
        productList.add(product);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        // Logic to update an existing product
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(product.getId())) {
                productList.set(i, product);
                return product;
            }
        }
        return null; // Product not found
    }

    @Override
    public void deleteProduct(Long productId) {
        // Logic to delete an existing product
        productList.removeIf(product -> product.getId().equals(productId));
    }

    @Override
    public Product getProduct(Long productId) {
        // Logic to retrieve a product by its ID
        for (Product product : productList) {
            if (product.getId().equals(productId)) {
                return product;
            }
        }
        return null; // Product not found
    }

    @Override
    public List<Product> getAllProducts() {
        // Logic to retrieve all products
        return productList;
    }
}
