package com.felipe.IoC.Services;

import com.felipe.IoC.Models.User;
import com.felipe.IoC.Models.UserInst;
import com.felipe.IoC.Repositories.BaseRepository;
import com.felipe.IoC.Repositories.UserInstRepository;
import com.felipe.IoC.Repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInstService extends BaseService<UserInst>{

   private final UserInstRepository userInstRepository;

    public UserInstService(BaseRepository<UserInst> baseRepository, UserInstRepository userInstRepository) {
        super(baseRepository);
        this.userInstRepository = userInstRepository;
    }

    //-----------------------------------------------------------------------------------------
    public UserInst findUserById(Long id) {
        Optional<UserInst> I = userInstRepository.findById(id);
        if(I.isPresent()) {
            return I.get();
        } else {
            return null;
        }
    }

    public UserInst findByEmail(String email) {
        return userInstRepository.findByEmail(email);
    }
    //------------------------------------------------------------------------------------------

    public UserInst createUserInst(UserInst userI) {
        return userInstRepository.save(userI);
    }

    public UserInst registerUserInst(UserInst userI) {
        String hashed = BCrypt.hashpw(userI.getPassword(), BCrypt.gensalt());
        userI.setPassword(hashed);
        return userInstRepository.save(userI);
    }

    public boolean authenticateUserInst(String email, String password) {
        UserInst userInst = userInstRepository.findByEmail(email);
        if(userInst == null) {
            return false;
        } else {
            if(BCrypt.checkpw(password, userInst.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
}
