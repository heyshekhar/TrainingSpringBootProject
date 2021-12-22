package com.eci.training.service;

import java.util.List;

import com.eci.training.domain.Product;

public interface ProductService {

    int createNewProduct(Product toBeSaved);

    Product findById(int id);

    List<Product> findAll();

    void removeProduct(int id);

}
