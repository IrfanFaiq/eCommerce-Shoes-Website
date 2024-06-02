//package com.springProject.shooz.service;
//
//import com.springProject.shooz.entity.Product;
//import com.springProject.shooz.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    private static ProductRepository productRepository;
//
//    public static List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
//
//    public static double calculateTotalPrice(List<Product> products) {
//        return products.stream().mapToDouble(Product::getPrice).sum();
//    }
//
//}
