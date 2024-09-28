package com.learning.microservices.order.dto.base;

public interface Operation <I extends OperationRequest , O extends OperationResponse >{
    O process(I request);
}
