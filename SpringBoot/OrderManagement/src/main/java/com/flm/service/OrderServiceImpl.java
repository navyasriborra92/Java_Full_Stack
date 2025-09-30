package com.flm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flm.dao.OrderItemRepository;
import com.flm.dao.OrderRepository;
import com.flm.dao.ProductRepository;
import com.flm.dto.OrderItemResponseDto;
import com.flm.dto.OrderRequestDto;
import com.flm.dto.OrderResponseDto;
import com.flm.exceptions.OrderItemNotFoundException;
import com.flm.exceptions.OrderNotFoundException;
import com.flm.model.Order;
import com.flm.model.OrderItem;
import com.flm.model.Products;


@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	OrderItemRepository orderItemRepository;
	
	@Override
	public OrderResponseDto placeOrder(List<OrderRequestDto> orderRequestDtoList) {
		Order order = new Order();
		List<OrderItem> orderitems = new ArrayList<OrderItem>();
		order.setStatus("Ordered");
		for(OrderRequestDto o:orderRequestDtoList) {
			OrderItem orderItem = new OrderItem();
			Products products = productRepository.findById(o.getProductId()).get();
			if(products.getStock()>= o.getQuantity()) {
			orderItem.setQuantity(o.getQuantity());
			orderItem.setProducts(products);
			orderItem.setOrder(order);
			orderitems.add(orderItem);
			productRepository.updateStock(products.getProductId(), products.getStock()-o.getQuantity());
			}
		}
		order.setOrderitems(orderitems);
		Order save = orderRepository.save(order);
		
		OrderResponseDto orderResponseDto = buildOrderResponseDtoFromOrder(order);
			return orderResponseDto;
		}

	private OrderResponseDto buildOrderResponseDtoFromOrder(Order save) {
		OrderResponseDto orderResponseDto = new OrderResponseDto();
		orderResponseDto.setOrderId(save.getOrderId());
		orderResponseDto.setStatus(save.getStatus());
		
		List<OrderItemResponseDto> OrderItemRecsponseDtoList = new ArrayList<OrderItemResponseDto>();
		double totalOrderAmount = 0;
		for(OrderItem oi : save.getOrderitems()){
			OrderItemResponseDto orderItemResponseDto = new OrderItemResponseDto();
			orderItemResponseDto.setProductId(oi.getProducts().getProductId());
			orderItemResponseDto.setProductName(oi.getProducts().getProductName());
			orderItemResponseDto.setQuantity(oi.getQuantity());
			orderItemResponseDto.setEachProductPrice(oi.getProducts().getPrice());
			double totalprice = oi.getProducts().getPrice()*oi.getQuantity();
			orderItemResponseDto.setTotalProductPrice(totalprice);
			totalOrderAmount +=totalprice;
			OrderItemRecsponseDtoList.add(orderItemResponseDto);
			
		}
		orderResponseDto.setOrderItemResponseDtoList(OrderItemRecsponseDtoList);
		orderResponseDto.setTotalAmount(totalOrderAmount);
		return orderResponseDto;
	}

	@Override
	public ResponseEntity<OrderResponseDto> getOrderInfo(long orderId) {
		// TODO Auto-generated method stub
		Order order = orderRepository.findById(orderId)
						.orElseThrow(() -> new OrderNotFoundException("No order found with id: "+ orderId))
				;
		OrderResponseDto orderResponseDtoFromOrder = buildOrderResponseDtoFromOrder(order);
		return ResponseEntity.status(HttpStatus.OK).body(orderResponseDtoFromOrder);
	}

	@Override
	public ResponseEntity<Void> cancelOrder(long orderitemid) {
		// TODO Auto-generated method stub
			OrderItem orderItem = orderItemRepository.findById(orderitemid)
								.orElseThrow(()-> new OrderItemNotFoundException("No order item found with the id : " + orderitemid));
				orderItemRepository.deleteById(orderitemid);
				long productId = orderItem.getProducts().getProductId();
				int stock = orderItem.getProducts().getStock();
				productRepository.updateStock(productId , stock + orderItem.getQuantity());
		return ResponseEntity.noContent().build();
	}
	}
