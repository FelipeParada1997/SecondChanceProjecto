package com.felipe.IoC.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BaseRepository<T> extends CrudRepository <T, Long> {
    List<T> findAll();
}
