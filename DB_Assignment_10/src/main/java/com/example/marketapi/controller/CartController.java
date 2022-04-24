package com.example.marketapi.controller;

import com.example.marketapi.model.Cart;
import com.example.marketapi.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @PostMapping("/cart/{user_id}")
    public Cart createCart(@RequestBody Cart cart, @PathVariable Integer user_id) {
        return cartService.createCart(cart, user_id);
    }

    @DeleteMapping("/cart-remove/{user_id}/{cart_id}")
    public String deleteCart(@PathVariable Integer user_id, @PathVariable Integer cart_id) {
        cartService.deleteCart(user_id, cart_id);
        return "Cart has been successfully deleted!";
    }

    @GetMapping("/cart-view/{cart_id}")
    public Cart getCartById(@PathVariable Integer cart_id) {
        return cartService.getCartById(cart_id);
    }

    @GetMapping("/carts-view")
    public Iterable<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    @GetMapping("/carts-from-all-users-sorted-by-the-total-of-the-products")
    public List<Cart> getFilteredCarts() {
        return cartService.filteredCarts();
    }
}
