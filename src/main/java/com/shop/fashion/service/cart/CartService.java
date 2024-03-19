package com.shop.fashion.service.cart;

import com.shop.fashion.entity.Cart;
import com.shop.fashion.entity.User;
import com.shop.fashion.exception.ProductException;
import com.shop.fashion.request.AddItemRequest;
import org.springframework.stereotype.Service;

@Service
public interface CartService {
    public Cart createCart(User user);

    public String addCartItem(Long userId, AddItemRequest request) throws ProductException;

    public Cart findUserCart(Long userId);
}
