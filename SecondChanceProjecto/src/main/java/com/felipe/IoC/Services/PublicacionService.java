package com.felipe.IoC.Services;

import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Repositories.PublicacionRepository;

public class PublicacionService extends BaseService<Publicacion>{
    public PublicacionService (PublicacionRepository baseRepository){
        super(baseRepository);
        this.baseRepository = baseRepository;
    }
    
}
