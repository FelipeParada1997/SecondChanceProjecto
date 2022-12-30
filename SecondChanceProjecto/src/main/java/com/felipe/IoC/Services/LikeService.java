package com.felipe.IoC.Services;

import com.felipe.IoC.Repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LikeService extends BaseService<Like>{

    private final LikeRepository likeRepository;

    public LikeService(BaseRepository<Like> baseRepository) {
        super(baseRepository);
    }

    //-------------------------------------------Nose si esta bien-------------------------------------
    public Like saveLike(Like like) {
        return likeRepository.save(like);
    }

    public void deleteLike(Long id) {
        Optional<Like> like = likeRepository.findById(id);
        if(like.isPresent()) {
            likeRepository.deleteById(id);
        }
    }

}
