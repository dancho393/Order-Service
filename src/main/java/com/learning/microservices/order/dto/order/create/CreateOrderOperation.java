package com.learning.microservices.order.dto.order.create;

import com.learning.microservices.order.dto.base.Operation;

public interface CreateOrderOperation
        extends Operation<CreateOrderRequest, CreateOrderResponse> {
     CreateOrderResponse process(CreateOrderRequest request);
}
