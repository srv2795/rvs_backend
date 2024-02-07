package com.reactive.ReactiveApp;

import com.reactive.ReactiveApp.services.FluxTesting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

@SpringBootTest
public class FluxTest {

    @Autowired
    private FluxTesting fluxTesting;

    @Test
    void testFluxServiceMethod() {
        this.fluxTesting.fluxTestingService();
    }

    @Test
    public void simpleFluxTest() {
        fluxTesting.getFlux().subscribe(data -> {
            System.out.println(data);
            System.out.println("Done with flux");
        });
    }

    @Test
    public void getFLuxFroIterable() {
        fluxTesting.getValuesFromIterable().subscribe(System.out::println);
    }

    @Test
    public void mapFluxTest() {
        fluxTesting.mapExampleFlux().subscribe(System.out::println);
    }

    @Test
    public void mapFluxTest2() {
        StepVerifier.create(fluxTesting.mapExampleFlux())
                .expectNextCount(3)
                .verifyComplete();
    }

    @Test
    public void filterTest() {
        fluxTesting.filterExamplke().subscribe(System.out::println);
    }

    @Test
    void flatMapTest() {
        StepVerifier.create(fluxTesting.flatMap()).expectNextCount(18).verifyComplete();
    }
}
