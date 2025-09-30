package com.flm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flm.dao.ProductRepository;
import com.flm.dto.ProductRequestDto;
import com.flm.dto.ProductResponseDto;
import com.flm.model.Products;
import com.flm.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	@PostMapping("/save")
	public ProductResponseDto saveItem(@RequestBody ProductRequestDto productRequestDto) {
		return productService.save(productRequestDto);
	}
	
	@PostMapping("/saveAll")
	public List<ProductResponseDto> saveAllProducts(@RequestBody List<ProductRequestDto> productRequestDtolist) {
		return productService.saveAll(productRequestDtolist);
	}
	
	@GetMapping("/allProducts")
	public List<ProductResponseDto> getProducts() {
		return productService.getProducts();
		
	}
	
	@GetMapping("/{id}")
	public ProductResponseDto getProduct(@PathVariable long id) {
		return productService.getProducts(id);
		
	}
	
	@GetMapping()
	public List<ProductResponseDto> getProductByName(@RequestParam(name = "productName") String name) {
		return productService.getProductByName(name);
		
	}
	
	@PutMapping("/update/{id}")
	public ProductResponseDto UpdateProductRating(@PathVariable(name = "id") long id, @RequestParam(name = "rating")double rating) {
		return productService.updateProductByRating(id, rating);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteProductRating(@PathVariable(name = "id") long id) {
		return productService.updateProductByRating(id);
		
	}
	
	@GetMapping("/count")
	public long countItems() {
	    return productRepository.count();
	}
}
