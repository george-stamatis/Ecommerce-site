package com.store.ecommerce.dto;

import com.store.ecommerce.entity.Address;
import com.store.ecommerce.entity.Customer;
import com.store.ecommerce.entity.Order;
import com.store.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private  Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
