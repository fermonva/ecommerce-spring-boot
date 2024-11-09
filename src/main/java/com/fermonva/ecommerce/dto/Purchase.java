package com.fermonva.ecommerce.dto;

import com.fermonva.ecommerce.entities.Address;
import com.fermonva.ecommerce.entities.Customer;
import com.fermonva.ecommerce.entities.Order;
import com.fermonva.ecommerce.entities.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
