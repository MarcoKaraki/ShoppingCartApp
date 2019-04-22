package com.example.common;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Component
public class SampleProductLoader {
	
	@Autowired
	ProductRepository productRepository;
	
	@PostConstruct
    public void init() {
		List<Product> sampleProducts = new ArrayList<Product>();
		sampleProducts.add(new Product(1, "iPhone", 499));
		sampleProducts.add(new Product(2, "Hair Brush", 10.50));
		sampleProducts.add(new Product(3, "Baby Food", 15.2));
		sampleProducts.add(new Product(4, "Peanuts", 8.99));
		sampleProducts.add(new Product(5, "Jeans", 25.30));
		
        productRepository.saveAll(sampleProducts);
    }
}
