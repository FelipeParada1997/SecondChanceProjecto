package com.felipe.IoC.Repositories;

import com.felipe.IoC.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends BaseRepository <User> {
    User findByEmail(String email);
}
