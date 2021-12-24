package com.gamesdb.gamesdbsbserver;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GamesRepository extends CrudRepository<Games, Integer> {
    Page<Games> findAll(Pageable pageable);
}
