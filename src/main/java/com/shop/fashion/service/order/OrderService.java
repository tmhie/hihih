package com.shop.fashion.service.order;

import com.shop.fashion.entity.Address;
import com.shop.fashion.entity.Order;
import com.shop.fashion.entity.User;
import com.shop.fashion.exception.OrderException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public interface OrderService {
    public Order createdOrder(User user, Address shippingAddress);
    public Order findOrderById(Long orderId) throws OrderException;
    public List<Order> usersOrderHistory(Long userId);
    public Order placedOrder(Long orderId) throws OrderException;
    public Order confirmedOrder(Long orderId) throws OrderException;
    public Order shippedOrder(Long orderId) throws OrderException;
    public Order deliveredOrder(Long orderId) throws OrderException;
    public Order cancledOrder(Long orderId) throws OrderException;
    public List<Order> getAllOrders();
    public void deleteOrder(Long orderId) throws OrderException;
}
