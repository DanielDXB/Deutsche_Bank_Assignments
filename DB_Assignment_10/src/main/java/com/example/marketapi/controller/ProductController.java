package com.example.marketapi.controller;

import com.example.marketapi.model.Product;
import com.example.marketapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/product-to-cart/{cart_id}")
    public Product addProductToCart(@RequestBody Product product, @PathVariable Integer cart_id) {
        return productService.addProductToCart(product, cart_id);
    }

    @PostMapping("/product-to-wishlist/{user_id}")
    public Product addProductToWishList(@RequestBody Product product, @PathVariable Integer user_id) {
        return productService.addProductToWishlist(product, user_id);
    }

    @DeleteMapping("/product-from-cart/{cart_id}/{product_id}")
    public String deleteProductFromCart(@PathVariable Integer cart_id, @PathVariable Integer product_id) {
        productService.deleteProductFromCart(cart_id, product_id);
        return "Product has been successfully deleted from cart";
    }

    @DeleteMapping("/product-from-wishlist/{cart_id}/{product_id}")
    public String deleteProductFromWishlist(@PathVariable Integer cart_id, @PathVariable Integer product_id) {
        productService.deleteProductFromWishlist(cart_id, product_id);
        return "Product has been successfully deleted from wishlist";
    }

    @GetMapping("/product-view/{product_id}")
    public Product getProductById(@PathVariable Integer product_id) {
        return productService.getProductById(product_id);
    }

    @GetMapping("/products-view")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
