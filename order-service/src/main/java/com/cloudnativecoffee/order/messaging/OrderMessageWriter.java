package com.cloudnativecoffee.order.messaging;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.cloudnativecoffee.order.model.Order;

@MessagingGateway
public interface OrderMessageWriter {

    @Gateway(requestChannel = "orderChannel")
    void write(Order order);

}