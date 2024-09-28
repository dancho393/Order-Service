package com.learning.microservices.order.service.order;

import com.learning.microservices.order.dto.order.create.CreateOrderOperation;
import com.learning.microservices.order.dto.order.create.CreateOrderRequest;
import com.learning.microservices.order.dto.order.create.CreateOrderResponse;
import com.learning.microservices.order.model.Order;
import com.learning.microservices.order.repo.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateOrderService implements CreateOrderOperation {
    private final OrderRepository orderRepository;
    @Override
    public CreateOrderResponse process(CreateOrderRequest request) {
        Order order = Order.builder()
                .orderNumber(UUID.randomUUID().toString())
                .price(request.price())
                .skuCode(request.skuCode())
                .quantity(request.quantity())
                .build();
        orderRepository.save(order);

        return new CreateOrderResponse(
                "Order Created",
                order.getId().toString(),
                order.getOrderNumber(),
                order.getSkuCode(),
                order.getPrice().toString(),
                order.getQuantity().toString()
        );
    }
}
