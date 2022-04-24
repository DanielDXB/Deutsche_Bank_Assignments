package com.example.marketapi.unit;

import com.example.marketapi.model.Cart;
import com.example.marketapi.model.Product;
import com.example.marketapi.model.User;
import com.example.marketapi.service.CartService;
import com.example.marketapi.service.ProductService;
import com.example.marketapi.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ProductServiceTest {
    @Autowired
    CartService cartService;

    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    @Test
    public void whenCreateProduct_ThenProductTableSizeMustBeOne() {
        User user = new User();
        userService.createUser(user);

        Cart cart = new Cart();
        cartService.createCart(cart, user.getId());

        Product product = new Product();
        productService.addProductToCart(product, cart.getId());

        List<Product> productList = new ArrayList<>(productService.getAllProducts());

        Assertions.assertEquals(1, productList.size());
    }
}
