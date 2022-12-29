package com.felipe.IoC.Services;

import java.util.List;

import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Repositories.PublicacionRepository;

public class PublicacionService extends BaseService<Publicacion>{
    private final PublicacionRepository publicacionRepository;

    public PublicacionService (PublicacionRepository publicacionRepository){

        super(publicacionRepository);
        this.publicacionRepository = publicacionRepository;
    }

    public List<Publicacion>todaMesasPersonas(){
        return publicacionRepository.findAll();
    }

    
}
