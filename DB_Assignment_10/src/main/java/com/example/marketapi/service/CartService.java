package com.example.marketapi.service;

import com.example.marketapi.model.Cart;
import com.example.marketapi.repository.CartRepository;
import com.example.marketapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
@Transactional
public class CartService {
    private final CartRepository cartRepository;
    private final UserRepository userRepository;

    public Cart createCart(Cart cart, Integer user_id) {
        userRepository.getById(user_id).getUserCart().add(cart);
        return cartRepository.save(cart);
    }

    public void deleteCart(Integer user_id, Integer cart_id) {
        userRepository.getById(user_id).getUserCart().remove(cartRepository.getById(cart_id));
        cartRepository.deleteById(cart_id);
    }

    public Cart getCartById(Integer cart_id) {
        return cartRepository.getById(cart_id);
    }

    public Iterable<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public List<Cart> filteredCarts() {
        List<Cart> cartList = new ArrayList<>();
        for (var x : userRepository.findAll())
            cartList.addAll(x.getUserCart());
        return cartList.stream().sorted(Comparator.comparing(cart -> cart.getProductList().size())).collect(Collectors.toList());
    }
}
