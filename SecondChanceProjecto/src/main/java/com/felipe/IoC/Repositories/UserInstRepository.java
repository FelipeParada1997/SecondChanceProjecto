package com.felipe.IoC.Repositories;

import org.springframework.stereotype.Repository;

import com.felipe.IoC.Models.User;
import com.felipe.IoC.Models.UserInst;

@Repository
public interface UserInstRepository extends BaseRepository<UserInst>{
	User findByEmail(String email);
}
