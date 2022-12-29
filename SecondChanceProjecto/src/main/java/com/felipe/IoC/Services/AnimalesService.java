package com.felipe.IoC.Services;

import org.springframework.stereotype.Service;

import com.felipe.IoC.Models.Animales;
import com.felipe.IoC.Repositories.AnimalesRepository;
import com.felipe.IoC.Repositories.BaseRepository;

@Service
public class AnimalesService extends BaseService<Animales>{

    private final AnimalesRepository animalesRepository;

    public AnimalesService(BaseRepository<Animales> baseRepository, AnimalesRepository animalesRepository) {
        super(baseRepository);
        this.animalesRepository = animalesRepository;
    }

    

    
}
