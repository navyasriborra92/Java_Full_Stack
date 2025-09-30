package com.flm.service;


import java.util.List;

import com.flm.dto.ProductRequestDto;
import com.flm.dto.ProductResponseDto;

public interface ProductService {

	public ProductResponseDto save(ProductRequestDto productRequestDto);

	public List<ProductResponseDto> getProducts();

	public ProductResponseDto getProducts(long id);

	public List<ProductResponseDto> getProductByName(String name);

	public List<ProductResponseDto> saveAll(List<ProductRequestDto> productRequestDtolist);

	public ProductResponseDto updateProductByRating(long id, double rating);

	public String updateProductByRating(long id);
}
