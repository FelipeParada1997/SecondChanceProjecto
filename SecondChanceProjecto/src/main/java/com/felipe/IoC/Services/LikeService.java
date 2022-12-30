package com.felipe.IoC.Services;

import com.felipe.IoC.Repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LikeService extends BaseService<Like>{

    private final LikeRepository likeRepository;

    public LikeService(BaseRepository<Like> baseRepository) {
        super(baseRepository);
    }

}
