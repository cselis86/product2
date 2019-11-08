package com.elis.product2.product2.controllers;

import com.elis.product2.product2.model.dtos.product.find.GetProductDetailsDto;
import com.elis.product2.product2.model.entities.Product;
import com.elis.product2.product2.repositories.ProductRepository;
import com.elis.product2.product2.services.impl.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    private ProductService productService;

    @GetMapping("/getProducts")
    public List<Product> getProducts(){

        return productRepository.findAll();

    }

    @GetMapping("/{id}")
    public GetProductDetailsDto getProductDetails(@PathVariable Long id){
        return productService.getProductById(id);
    }
}
