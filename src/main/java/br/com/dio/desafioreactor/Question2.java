package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

import java.util.List;

public class Question2 {

    public Mono<Long> countAdmins(final List<User> users){
        return Mono.just(users)
                .flatMapIterable(userList -> userList)
                .filter(user -> user.isAdmin())
                .count();

    }

}
