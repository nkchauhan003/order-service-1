package com.cb.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Order {
    private String orderId;
    private String product;
    private int quantity;
    private double price;
}
