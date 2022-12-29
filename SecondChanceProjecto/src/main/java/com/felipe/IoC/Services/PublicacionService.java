package com.felipe.IoC.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Repositories.PublicacionRepository;

@Service
public class PublicacionService extends BaseService<Publicacion>{
    private final PublicacionRepository publicacionRepository;

    public PublicacionService (PublicacionRepository publicacionRepository){

        super(publicacionRepository);
        this.publicacionRepository = publicacionRepository;
    }
    public List<Publicacion>mostrarPublicacions(){
        return publicacionRepository.findAll();
    }
    public Publicacion savePublicacion(Publicacion publicacion){
        return publicacionRepository.save(publicacion);
    }
    
}
