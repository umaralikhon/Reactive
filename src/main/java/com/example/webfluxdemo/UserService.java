package com.example.webfluxdemo;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    UserService() {
        users.add(new User(1, "Alisa"));
        users.add(new User(2, "Alexa"));
    }

    Flux<User> getAll() {
        return Flux.fromIterable(users);
    }
}
