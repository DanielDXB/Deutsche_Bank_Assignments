package com.example.marketapi.service;

import com.example.marketapi.model.User;
import com.example.marketapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer user_id) {
        return userRepository.findById(user_id).get();
    }

    public void deleteUser(Integer user_id) {
        userRepository.deleteById(user_id);
    }

    public List<User> filteredUsers() {
        return userRepository.findAll().stream().sorted(Comparator.comparing(
                user -> user.getUserCart().size())).collect(Collectors.toList());

    }
}
