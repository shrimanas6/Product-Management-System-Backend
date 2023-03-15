package com.sasvcoders.ProductManager.service;

import com.sasvcoders.ProductManager.model.Product;
import com.sasvcoders.ProductManager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepo;

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }

    @Override
    public String deleteProduct(Integer id) {
        Product product = productRepo.findById(id).get();
        if(product != null){
            productRepo.delete(product);
            return "Product deleted successfully";
        }
        return "Something went wrong from server end";
    }
}
