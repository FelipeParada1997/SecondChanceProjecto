package com.felipe.IoC.Repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BaseRepository<T> extends CrudRepository <T, Long> {
    List<T> findAll();
}
