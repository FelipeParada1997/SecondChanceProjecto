package com.felipe.IoC.Services;

import com.felipe.IoC.Models.User;
import com.felipe.IoC.Repositories.BaseRepository;
import com.felipe.IoC.Repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInstService extends BaseService<UserInst>{

   private final UserInstRepository userInstRepository;

    public UserInstService(BaseRepository<UserInst> baseRepository) {
        super(baseRepository);
    }
    //-----------------------------------------------------------------------------------------
    public UserInst findUserById(Long id) {
        Optional<User> u = userInstRepository.findById(id);
        if(u.isPresent()) {
            return u.get();
        } else {
            return null;
        }
    }

    public UserInst findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    //------------------------------------------------------------------------------------------

    public User createUser(User u) {
        return userInstRepository.save(u);
    }

    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userInstRepository.save(user);
    }

    public boolean authenticateUser(String email, String password) {
        User user = userInstRepository.findByEmail(email);
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
