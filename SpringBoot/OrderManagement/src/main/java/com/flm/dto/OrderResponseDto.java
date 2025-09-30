package com.flm.dto;

import java.util.List;

public class OrderResponseDto {
	
	private long OrderId;
	
	private String status;
	
	private double totalAmount;

	private List<OrderItemResponseDto> orderItemResponseDtoList;

	public long getOrderId() {
		return OrderId;
	}

	public void setOrderId(long orderId) {
		OrderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<OrderItemResponseDto> getOrderItemResponseDtoList() {
		return orderItemResponseDtoList;
	}

	public void setOrderItemResponseDtoList(List<OrderItemResponseDto> orderItemResponseDtoList) {
		this.orderItemResponseDtoList = orderItemResponseDtoList;
	}

	public OrderResponseDto(String status, double totalAmount, List<OrderItemResponseDto> orderItemResponseDtoList) {
		super();
		this.status = status;
		this.totalAmount = totalAmount;
		this.orderItemResponseDtoList = orderItemResponseDtoList;
	}

	public OrderResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
