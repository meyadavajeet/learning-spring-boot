package com.thinkcoder.webfluxcrud.Repository;

import com.thinkcoder.webfluxcrud.dao.entity.common.Blog;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface BlogRepository extends ReactiveCrudRepository<Blog, String> {
    Flux<Blog> findByAuthor(String author);

    Flux<Blog> findAuthorAndDeleteIsFalse(String titleKeyboard);

    Mono<Blog> findByTitle(String title);

    Mono<Blog> findByIdAndDeleteIsFalse(String id);

}
