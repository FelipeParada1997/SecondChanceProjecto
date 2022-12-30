package com.felipe.IoC.Services;

import com.felipe.IoC.Repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class CiudadService extends BaseService<Ciudad>{
    private final CiudadRepository ciudadRepository;

    public CiudadService(BaseRepository<Ciudad> baseRepository) {
        super(baseRepository);
        }

    }

