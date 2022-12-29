package com.felipe.IoC.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.felipe.IoC.Models.Publicacion;
import com.felipe.IoC.Repositories.PublicacionRepository;

@Service
public class PublicacionService extends BaseService<Publicacion>{
    public PublicacionService (PublicacionRepository baseRepository){
        super(baseRepository);
        this.baseRepository = baseRepository;
    }
    
}
