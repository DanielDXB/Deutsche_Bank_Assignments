package com.example.marketapi.controller;

import com.example.marketapi.model.Wishlist;
import com.example.marketapi.service.WishlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class WishlistController {
    private final WishlistService wishlistService;

    @PostMapping("/wishlist/{user_id}")
    public Wishlist createWishlist(@RequestBody Wishlist wishlist, @PathVariable Integer user_id) {
        return wishlistService.createWishlist(wishlist, user_id);
    }

    @DeleteMapping("/wishlist-remove/{user_id}")
    public String deleteCart(@PathVariable Integer user_id) {
        wishlistService.deleteWishlist(user_id);
        return "Wishlist has been successfully deleted";
    }

    @GetMapping("/wishlist-view/{user_id}")
    public Wishlist getWishlistByUserId(@PathVariable Integer user_id) {
        return wishlistService.getWishlistByUserId(user_id);
    }

}
