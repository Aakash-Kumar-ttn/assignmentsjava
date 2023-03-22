package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderServiceTest {

    @Test
    public void test_PlaceOrder(){  // boolean placeOrder(Order order, String cc)
       // boolean isCustomerNotified
        Order order = new Order(100 , "Bottle" , 500);
        // order.setCustomerNotified(false);
        assertTrue(OrderService.getInstance().placeOrder(order , "Car"));
    }
}

