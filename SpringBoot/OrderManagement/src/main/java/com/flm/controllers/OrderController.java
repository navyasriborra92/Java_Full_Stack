package com.flm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.dto.OrderRequestDto;
import com.flm.dto.OrderResponseDto;
import com.flm.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/buy")
	public OrderResponseDto placeOrder(@RequestBody List<OrderRequestDto> orderRequestDtoList) {
		return orderService.placeOrder(orderRequestDtoList);
	}
	
	@DeleteMapping("/cancel/{orderitemid}")
	public ResponseEntity<Void> cancelItem(@PathVariable(name = "orderitemid") long orderitemid) {
		return orderService.cancelOrder(orderitemid);
	}
	
	@GetMapping("/{orderid}")
	public ResponseEntity<OrderResponseDto> getOrderInfo(@PathVariable(name = "orderid") long orderId) {
		return orderService.getOrderInfo(orderId);
		
	}
}
