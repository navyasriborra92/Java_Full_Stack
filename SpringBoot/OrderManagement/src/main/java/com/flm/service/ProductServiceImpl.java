package com.flm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.flm.dao.ProductRepository;
import com.flm.dto.ProductRequestDto;
import com.flm.dto.ProductResponseDto;
import com.flm.model.Products;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	@Override
	public ProductResponseDto save(ProductRequestDto productRequestDto) {
		Products products = new Products();
		products.setProductName(productRequestDto.getProductName());
		products.setPrice(productRequestDto.getPrice());
		products.setDiscount(productRequestDto.getDiscount());
		products.setAvailable(true);
		products.setStock(productRequestDto.getStock());
		Products save = productRepository.save(products);
		ProductResponseDto productResponseDto = new ProductResponseDto();
		BeanUtils.copyProperties(save, productResponseDto);
		return productResponseDto;
	}
	@Override
	public List<ProductResponseDto> getProducts() {
		// TODO Auto-generated method stub
		List<Products> productsList = productRepository.findAll();
		List<ProductResponseDto> list = extracted(productsList);
		
		return list;
	}
	private List<ProductResponseDto> extracted(List<Products> productsList) {
		List<ProductResponseDto> list = new ArrayList<ProductResponseDto>();
		for(Products i: productsList) {
			ProductResponseDto productResponseDto = new ProductResponseDto();
			BeanUtils.copyProperties(i, productResponseDto);
			list.add(productResponseDto);
		}
		return list;
	}
	
	@Override
	public ProductResponseDto getProducts(long id) {
		Products products = productRepository.findById(id).get();
		ProductResponseDto productResponseDto = new ProductResponseDto();
		BeanUtils.copyProperties(products,productResponseDto);
		return productResponseDto;
	}
	@Override
	public List<ProductResponseDto> getProductByName(String name) {
		List<Products> productsList = productRepository.findByProductNameContaining(name);
		List<ProductResponseDto> list = extracted(productsList);
		return list;
	}
	
	@Override
	public List<ProductResponseDto> saveAll(List<ProductRequestDto> productRequestDtoList) {
		// TODO Auto-generated method stub
		List<Products> productsList = new ArrayList<Products>();
		
		for(ProductRequestDto productRequestDto: productRequestDtoList) {
			Products products = new Products();
			BeanUtils.copyProperties(productRequestDto, products);
			productsList.add(products);
		}
		List<Products> saveAll = productRepository.saveAll(productsList);
		List<ProductResponseDto> extracted = extracted(saveAll);
		return extracted;
	}
	@Override
	public ProductResponseDto updateProductByRating(long id, double rating) {
		// TODO Auto-generated method stub
		
		Optional<Products> products = productRepository.findById(id);
		if(products.isPresent()) {
			ProductResponseDto productResponseDto = new ProductResponseDto();
			Products product = products.get();
			product.setRating(rating);
		Products save = productRepository.save(product);
		BeanUtils.copyProperties(save, productResponseDto);
		return productResponseDto;
		}
		return new ProductResponseDto();
	}
	@Override
	public String updateProductByRating(long id) {

		Optional<Products> products = productRepository.findById(id);
		if(products.isPresent()) {
			ProductResponseDto productResponseDto = new ProductResponseDto();
			Products product = products.get();
		productRepository.deleteById(product.getProductId());
		return product.getProductName();
		}
		return null;
	}




}
