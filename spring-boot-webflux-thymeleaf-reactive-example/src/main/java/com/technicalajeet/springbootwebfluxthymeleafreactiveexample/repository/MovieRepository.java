package com.technicalajeet.springbootwebfluxthymeleafreactiveexample.repository;

import com.technicalajeet.springbootwebfluxthymeleafreactiveexample.Movie;
import reactor.core.publisher.Flux;

public interface MovieRepository {
    Flux<Movie> findAll();
}
