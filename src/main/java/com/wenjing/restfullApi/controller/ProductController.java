package com.wenjing.restfullApi.controller;

import com.wenjing.restfullApi.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String product() {
        Product book = new Product(1L, "Spring Security");
        Product pen = new Product(2L, "AWS");
        List<Product> products = Arrays.asList(book, pen);
        return products.toString();
    }
}
