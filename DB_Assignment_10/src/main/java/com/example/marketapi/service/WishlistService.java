package com.example.marketapi.service;

import com.example.marketapi.model.Wishlist;
import com.example.marketapi.repository.UserRepository;
import com.example.marketapi.repository.WishlistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.transaction.Transactional;

@Controller
@RequiredArgsConstructor
@Transactional
public class WishlistService {
    private final WishlistRepository wishlistRepository;
    private final UserRepository userRepository;

    public Wishlist createWishlist(Wishlist wishlist, Integer user_id) {
        userRepository.getById(user_id).setWishlist(wishlist);
        return wishlistRepository.save(wishlist);
    }

    public void deleteWishlist(Integer user_id) {
        userRepository.getById(user_id).setWishlist(null);
        wishlistRepository.deleteAll();
    }

    public Wishlist getWishlistByUserId(Integer user_id) {
        return userRepository.getById(user_id).getWishlist();
    }

}
