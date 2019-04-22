package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CartItemWithNameAndPrice;
import com.example.entity.CartItem;
import com.example.repository.CartItemRepository;

@Service
public class CartItemService {

	@Autowired
	CartItemRepository cartItemRepository;
	
	public CartItem addCartItem(CartItem cartItem) {
		return cartItemRepository.save(cartItem);
	}

	public List<CartItemWithNameAndPrice> getCartItemsForUser(int userId) {
		//List<CartItem> cartItems = new ArrayList<CartItem>();
		//cartItemRepository.findAll().forEach(cartItems::add);
		//return cartItems;
		return cartItemRepository.findItemsForUser(userId);
	}

	public void removeCartItem(int cartItemId)
	{
		cartItemRepository.deleteById(cartItemId);
	}
}
