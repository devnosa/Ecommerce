package com.skillwill.ecommerce.service;

import com.skillwill.ecommerce.domain.Product;
import java.util.List;
public interface ProductService {

    Product createProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long productId);
    Product getProduct(Long productId);
    List<Product> getAllProducts();
}
