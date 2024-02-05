package com.reactive.ReactiveApp;

import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple3;

@SpringBootTest
class ReactiveAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void workingWithMono() {
		Mono<String> m2 = Mono.just("This is second mono.");
		Mono<String> m1 = Mono
				.just("Learn code with Ran Vijay Singh")
				.log()
				.then(m2);
		/*m1.subscribe(data -> {
			System.out.println("this is data : "+ data);
				}
		);*/
		m1.subscribe(System.out::println);

		Mono<Object> errorMono = Mono.error(new RuntimeException("Error : !!!"));
		errorMono.subscribe(System.out::println);

		Mono<String> mono1 = Mono.just("first mono data");
		Mono<String> mono2 = Mono.just("second mono data");
		Mono<String> mono3 = Mono.just("third mono data");

		Mono<Tuple3<String, String, String>> combinedMono = Mono.zip(mono1, mono2, mono3);
		combinedMono.subscribe(data -> {
			System.out.println("mono1 : "+ data.getT1());
			System.out.println("mono2 : "+ data.getT2());
			System.out.println("mono3 : "+ data.getT3());
		});

		Mono<Tuple2<String, String>> combindedWithAZip = mono1.zipWith(mono2);
		combindedWithAZip.subscribe(data -> {
			System.out.println(mono1.log().flux() );
			System.out.println(mono2.log());
		});

		Mono<String> monox= mono1.map(String::toUpperCase);
		monox.subscribe(System.out::println);

		Mono<String[]> monoArr =  mono1.flatMap(value1 -> Mono.just(value1.split(" ")));
		monoArr.subscribe(data ->{
			for (String str: data) {
				System.out.println(str);
			}
		});

		Flux<String> stringFlux = mono2.flatMapMany(value2 -> Flux.just(value2.split(""))).log();
		stringFlux.subscribe(data -> System.out.println(data));

		Flux<String> monoy = m1.concatWith(m2);
		monoy.subscribe(System.out::println);

	}

}
