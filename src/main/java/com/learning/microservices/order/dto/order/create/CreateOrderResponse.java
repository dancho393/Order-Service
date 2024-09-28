package com.learning.microservices.order.dto.order.create;

import com.learning.microservices.order.dto.base.OperationResponse;

public record CreateOrderResponse(
        String message,
        String Id,
        String orderNumber,
        String skuCode,
        String price,
        String quantity
) implements OperationResponse {
}
