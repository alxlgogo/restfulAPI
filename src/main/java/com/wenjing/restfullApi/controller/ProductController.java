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
        Product book = new Product(1L, "Book");
        Product pen = new Product(2L, "Pen");
        List<Product> products = Arrays.asList(book, pen);
        return products.toString();
    }
}
