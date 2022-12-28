package com.felipe.IoC.Services;

import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Repositories.PublicacionRepository;

public class PublicacionService extends BaseService<Publicacion>{
    private final PublicacionRepository publicacionRepository;

    public PublicacionService (PublicacionRepository publicacionRepository){

        super(publicacionRepository);
        this.publicacionRepository = publicacionRepository;
    }
    
}
