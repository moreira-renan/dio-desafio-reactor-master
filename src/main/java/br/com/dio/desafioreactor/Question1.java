package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;

import java.util.List;

public class Question1 {

    public Flux<Long> inc(final List<Long> numbers){
        return Flux.fromIterable(numbers)
                .map(number -> number + 1);
    }

}
