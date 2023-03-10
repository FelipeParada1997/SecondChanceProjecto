package com.felipe.IoC.Services;

import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Repositories.BaseRepository;
import com.felipe.IoC.Repositories.RegionRepository;
import org.springframework.stereotype.Service;



import com.felipe.IoC.Models.Region;

import java.util.Optional;

@Service
public class RegionService extends BaseService<Region>{
    private final RegionRepository regionRepository;

    public RegionService(BaseRepository<Region> baseRepository, RegionRepository regionRepository) {
        super(baseRepository);
        this.regionRepository = regionRepository;
    }

    public Region mostrarPublicaciones(Long id){
        Optional<Region> mostrar = regionRepository.findById(id);
        if (mostrar.isPresent()) {
            return mostrar.get();
        } else {
            return null;
        }
    }
}
