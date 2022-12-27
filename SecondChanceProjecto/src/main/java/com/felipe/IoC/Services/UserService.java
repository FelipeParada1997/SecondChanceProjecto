package com.felipe.IoC.Services;

import com.felipe.IoC.Repositories.BaseRepository;
import com.felipe.IoC.Repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService{
    private final UserRepository userRepository;

    public UserService(BaseRepository baseRepository, UserRepository userRepository) {
        super(baseRepository);
        this.userRepository = userRepository;
    }
}
