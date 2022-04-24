package com.example.marketapi.service;

import com.example.marketapi.model.Product;
import com.example.marketapi.repository.CartRepository;
import com.example.marketapi.repository.ProductRepository;
import com.example.marketapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {
    private final ProductRepository productRepository;
    private final CartRepository cartRepository;
    private final UserRepository userRepository;

    public Product addProductToCart(Product product, Integer cart_id) {
        cartRepository.getById(cart_id).getProductList().add(product);
        return productRepository.save(product);
    }

    public Product addProductToWishlist(Product product, Integer user_id) {
        userRepository.getById(user_id).getWishlist().getProductList().add(product);
        return productRepository.save(product);
    }

    public void deleteProductFromCart(Integer cart_id, Integer product_id) {
        cartRepository.getById(cart_id).getProductList().remove(productRepository.getById(product_id));
        productRepository.deleteById(product_id);
    }

    public void deleteProductFromWishlist(Integer user_id, Integer product_id) {
        userRepository.getById(user_id).getWishlist().getProductList().remove(productRepository.getById(product_id));
        productRepository.deleteById(product_id);
    }

    public Product getProductById(Integer product_id) {
        return productRepository.getById(product_id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
