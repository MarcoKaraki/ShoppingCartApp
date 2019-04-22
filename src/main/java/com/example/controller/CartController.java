package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.CartItemWithNameAndPrice;
import com.example.entity.CartItem;
import com.example.service.CartItemService;

@RestController
@RequestMapping(path="/cart")
@CrossOrigin(origins="*")
public class CartController {

	@Autowired
	CartItemService cartItemService;
	
	/**
	 * @return cart item with id if successfully saved
	 */
	@PostMapping
	public CartItem addCartItem(@RequestBody CartItem cartItem)
	{
		return cartItemService.addCartItem(cartItem);
	}
	
	
	/**
	 * @return all items in the cart for specified user
	 */
	@GetMapping
	public List<CartItemWithNameAndPrice> getCartItemsForUser(@RequestParam int userId)
	{
		return cartItemService.getCartItemsForUser(userId);
	}
	
	/**
	 * Deletes a specified cart item
	 */
	@DeleteMapping
	public void removeCartItem(@RequestParam int cartItemId)
	{
		cartItemService.removeCartItem(cartItemId);
	}
}
