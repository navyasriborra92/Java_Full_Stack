package com.flm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flm.dto.OrderRequestDto;
import com.flm.dto.OrderResponseDto;

@Service
public interface OrderService {
	
	public OrderResponseDto placeOrder(List<OrderRequestDto> orderRequestDtoList);

	public ResponseEntity<OrderResponseDto> getOrderInfo(long orderId);

	public ResponseEntity<Void> cancelOrder(long orderitemid);


}
