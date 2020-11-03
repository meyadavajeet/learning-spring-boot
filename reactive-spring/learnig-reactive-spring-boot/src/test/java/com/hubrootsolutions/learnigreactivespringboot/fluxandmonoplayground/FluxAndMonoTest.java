package com.hubrootsolutions.learnigreactivespringboot.fluxandmonoplayground;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxAndMonoTest {

    @Test
    public void testFlux() {
        Flux<String> stringFlux = Flux.just("spring", "spring boot", "Reactive Spring");

        stringFlux.subscribe(System.out::println);
    }

}
