package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.CartItemWithNameAndPrice;
import com.example.entity.CartItem;

@Repository
public interface CartItemRepository extends CrudRepository<CartItem, Integer>{
    @Query("SELECT new com.example.dto.CartItemWithNameAndPrice(c.id, p.name, c.quantity, p.price) "
    		+ "FROM CartItem c INNER JOIN Product p ON c.productId = p.id where c.userId = ?1")
    List<CartItemWithNameAndPrice> findItemsForUser(Integer id);
}
