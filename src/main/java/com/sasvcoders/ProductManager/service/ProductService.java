package com.sasvcoders.ProductManager.service;

import com.sasvcoders.ProductManager.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public Product saveProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(Integer id);
    public String deleteProduct(Integer id);
}
