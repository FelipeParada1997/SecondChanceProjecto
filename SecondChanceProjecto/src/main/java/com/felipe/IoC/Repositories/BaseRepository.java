package com.felipe.IoC.Repositories;

import antlr.collections.List;
import org.springframework.data.repository.CrudRepository;

public interface BaseRepository<T> extends CrudRepository <T, Long> {
    List<T> findAll();
}
