package com.example.marketapi.unit;

import com.example.marketapi.model.User;
import com.example.marketapi.model.Wishlist;
import com.example.marketapi.service.UserService;
import com.example.marketapi.service.WishlistService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class WishlistServiceTest {
    @Autowired
    WishlistService wishlistService;

    @Autowired
    UserService userService;

    @Test
    public void whenCreateWishlist_ThenWishlistTableSizeMustBeOne() {
        User user = new User();
        userService.createUser(user);

        Wishlist wishlist = new Wishlist();
        wishlistService.createWishlist(wishlist, user.getId());

        List<Wishlist> wishlistList = new ArrayList<>();
        wishlistList.add(userService.getUserById(user.getId()).getWishlist());

        Assertions.assertEquals(1, wishlistList.size());
    }
}
