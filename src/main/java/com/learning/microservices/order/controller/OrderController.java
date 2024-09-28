package com.learning.microservices.order.controller;

import com.learning.microservices.order.dto.order.create.CreateOrderRequest;
import com.learning.microservices.order.dto.order.create.CreateOrderResponse;
import com.learning.microservices.order.service.order.CreateOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/order")
@RestController
@RequiredArgsConstructor
public class OrderController {
    private final CreateOrderService createOrderService;
    @PostMapping
    public ResponseEntity<CreateOrderResponse>createOrder(
            @RequestBody CreateOrderRequest createOrderRequest){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createOrderService.process(createOrderRequest));
    }
}
