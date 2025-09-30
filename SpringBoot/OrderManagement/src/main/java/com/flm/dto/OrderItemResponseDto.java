package com.flm.dto;

public class OrderItemResponseDto {
	
	private long productId;
	
	private String productName;
	
	private long quantity;
	
	private double eachProductPrice;
	
	private double totalProductPrice;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getEachProductPrice() {
		return eachProductPrice;
	}

	public void setEachProductPrice(double eachProductPrice) {
		this.eachProductPrice = eachProductPrice;
	}

	public double getTotalProductPrice() {
		return totalProductPrice;
	}

	public void setTotalProductPrice(double totalProductPrice) {
		this.totalProductPrice = totalProductPrice;
	}

	public OrderItemResponseDto(String productName, long quantity, double eachProductPrice, double totalProductPrice) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.eachProductPrice = eachProductPrice;
		this.totalProductPrice = totalProductPrice;
	}

	public OrderItemResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
