package com.cb.controller;


import com.cb.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public Order getOrder(@RequestParam String orderId) throws InterruptedException {
        // 500 ms delay to simulate latency
        TimeUnit.MILLISECONDS.sleep(500);
        return Order.builder()
                .orderId(orderId)
                .product("Laptop")
                .quantity(1)
                .price(1200.00)
                .build();
    }
}
