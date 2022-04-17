package com.example.hw8.service;

import com.example.hw8.model.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserService {
    Random random = new Random();
    private String names[] = {"Daniel", "Alex", "Vasile", "Marcel", "Ioan", "Viorel", "Marian", "Cosmin"};

    public List<User> createUserList() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            userList.add(new User(i, names[random.nextInt(8)], random.nextInt(101)));
        }
        return userList;
    }

    public List<User> filterUsersByAgeLessThan18(List<User> userList) {
        return userList.stream().filter(user -> user.getAge() < 18).collect(Collectors.toList());
    }

    public List<User> doubleUsersAge(List<User> userList) {
        userList.forEach(s -> s.setAge(s.getAge() * 2));
        return userList;
    }

    public User getLastUser(List<User> userList) {
        return userList.stream().skip(userList.size() - 1).findFirst().get();
    }

    public List<Integer> getLowestAndHighest(List<User> userList) {
        List<Integer> MiniMax = new ArrayList<>();
        MiniMax.add(userList.stream().mapToInt(n -> n.getAge()).max().orElseThrow(NoSuchElementException::new));
        MiniMax.add(userList.stream().mapToInt(n -> n.getAge()).min().orElseThrow(NoSuchElementException::new));
        return MiniMax;
    }

    public List<User> removeDuplicates(List<User> userList) {
        return userList.stream().distinct().collect(Collectors.toList());
    }

    /**
     * nu am gasit o modalitate de one-line la functia asta, dar returneaza corect cele cerute
     */
    public List<User> megaFilter(List<User> userList) {
        List<User> userList1;
        userList1 = userList.stream().filter(user -> user.getAge() > 30).collect(Collectors.toList());
        userList1.stream().forEach(u -> u.setName(u.getName().toUpperCase()));
        userList1.sort(Comparator.comparing(User::getAge).reversed());

        return userList1;
    }
}
