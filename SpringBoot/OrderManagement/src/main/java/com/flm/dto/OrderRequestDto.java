package com.flm.dto;

public class OrderRequestDto {
	
	private long productId;
	
	private long quantity;
	
	private double price;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public OrderRequestDto(long productId, long quantity, double price) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}

	public OrderRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
