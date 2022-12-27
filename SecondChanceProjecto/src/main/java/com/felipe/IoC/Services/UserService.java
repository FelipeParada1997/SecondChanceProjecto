package com.felipe.IoC.Services;

import com.felipe.IoC.Models.User;
import com.felipe.IoC.Repositories.BaseRepository;
import com.felipe.IoC.Repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService{
    private final UserRepository userRepository;

    public UserService(BaseRepository baseRepository, UserRepository userRepository) {
        super(baseRepository);
        this.userRepository = userRepository;

    }
    //----------------------------------- Registro y Login------------------------------------------

    public User createUser(User u) {
        return userRepository.save(u);
    }

    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }

    public boolean authenticateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if(user == null) {
            return false;
        } else {
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }

}
