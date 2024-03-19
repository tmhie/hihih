package com.shop.fashion.service.cart;

import com.shop.fashion.entity.Cart;
import com.shop.fashion.entity.CartItem;
import com.shop.fashion.entity.Product;
import com.shop.fashion.exception.CartItemException;
import com.shop.fashion.exception.UserException;
import org.springframework.stereotype.Service;

@Service
public interface CartItemService {
    public CartItem createCartItem(CartItem cartItem);

    public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;

    public CartItem isCartItemExits(Cart cart, Product product, String size, Long userId);

    public void removeCartItem(Long userId, Long cartItemId) throws CartItemException,UserException;

    public CartItem findCartItemBy(Long cartItemId) throws CartItemException;
}
