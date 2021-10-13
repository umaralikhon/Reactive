package com.example.webfluxdemo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Mono;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class UserHandler {
    private UserService userService;

    public UserHandler(UserService userService){
        this.userService = userService;
    }

    public Mono<ServerResponse>findAll(ServerRequest request){
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(userService.getAll(), User.class);
    }
}
