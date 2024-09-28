package com.learning.microservices.order.dto.order.create;

import com.learning.microservices.order.dto.base.OperationRequest;

import java.math.BigDecimal;

public record CreateOrderRequest(
        String skuCode,
        BigDecimal price,
        Integer quantity
) implements OperationRequest {
}
