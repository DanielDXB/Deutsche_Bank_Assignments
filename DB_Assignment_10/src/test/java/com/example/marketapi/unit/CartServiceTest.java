package com.example.marketapi.unit;

import com.example.marketapi.model.Cart;
import com.example.marketapi.model.User;
import com.example.marketapi.model.Wishlist;
import com.example.marketapi.service.CartService;
import com.example.marketapi.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CartServiceTest {
    @Autowired
    CartService cartService;

    @Autowired
    UserService userService;

    @Test
    public void whenCreateCart_ThenCartTableSizeMustBeOne() {
        User user = new User();
        userService.createUser(user);

        Cart cart = new Cart();
        cartService.createCart(cart, user.getId());

        List<Cart> cartList = new ArrayList<>();
        cartList.addAll(userService.getUserById(user.getId()).getUserCart());

        Assertions.assertEquals(1, cartList.size());
    }
}
