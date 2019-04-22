package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Product;
import com.example.service.ProductService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	/**
	 * @return all products in the database
	 */
	@GetMapping
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}

}
