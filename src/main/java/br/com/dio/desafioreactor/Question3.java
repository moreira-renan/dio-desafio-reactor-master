package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

public class Question3 {

    public Mono<Void> userIsValid(final User user){
        if (user.getPasswor().length() > 8) {
            return Mono.empty();
        } else {
            return Mono.error(new IllegalArgumentException("Usuário inválido. A senha deve ter mais de 8 caracteres."));
        }
    }

}
