package com.elis.product2.product2.controllers;

import com.elis.product2.product2.model.dtos.product.create.CreateProductRec;
import com.elis.product2.product2.model.dtos.product.find.GetProductDetailsDto;
import com.elis.product2.product2.model.entities.Product;
import com.elis.product2.product2.repositories.ProductRepository;
import com.elis.product2.product2.services.impl.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    private ProductRepository productRepository;

    private ProductService productService;

    @GetMapping()
    public List<Product> getProducts(){

        return productRepository.findAll();

    }

    @GetMapping("/{id}")
    public GetProductDetailsDto getProductDetails(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public Long createProduct(@RequestBody CreateProductRec p) {
        return productService.createProduct(p);
    }
}
