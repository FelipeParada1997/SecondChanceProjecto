package com.felipe.IoC.Services;

import java.util.List;
import java.util.Optional;

import com.felipe.IoC.Repositories.BaseRepository;
import org.springframework.stereotype.Service;

import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Repositories.PublicacionRepository;

@Service
public class PublicacionService extends BaseService<Publicacion>{
    private final PublicacionRepository publicacionRepository;

    public PublicacionService(BaseRepository<Publicacion> baseRepository, PublicacionRepository publicacionRepository) {
        super(baseRepository);
        this.publicacionRepository = publicacionRepository;
    }

    public Publicacion mostrarPublicaciones(Long id){
        Optional<Publicacion> mostrar = publicacionRepository.findById(id);
        if (mostrar.isPresent()) {
            return mostrar.get();
        } else {
            return null;
        }
    }
}
