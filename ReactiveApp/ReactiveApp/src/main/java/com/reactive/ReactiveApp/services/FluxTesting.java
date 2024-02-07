package com.reactive.ReactiveApp.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class FluxTesting {

    public void fluxTestingService() {
        System.out.println("Testing flux service");
    }

    public Flux<String> getFlux() {
        Flux<String> fluxVariable = Flux.just("Ashu", "Himanshu", "Chetan").log();
        return fluxVariable;
    }

    public Flux<String> getValuesFromIterable() {
        List<String> list = List.of("Mango", "apple", "banana", "grapes");
        Flux<String> fluxIterable = Flux.fromIterable(list);
        return fluxIterable;
    }

    public Flux<String> mapExampleFlux() {
        return getFlux().map(data -> data.toUpperCase()).log();
    }

    public Flux<String> filterExamplke() {
        return getFlux().filter(name -> name.length() > 4).log();
    }

    public Flux<String> flatMap() {
       return getFlux().flatMap(name -> Flux.just(name.split(""))).log();
    }
}
