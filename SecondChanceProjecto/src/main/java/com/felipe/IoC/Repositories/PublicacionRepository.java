package com.felipe.IoC.Repositories;
import org.springframework.data.repository.CrudRepository;

import com.felipe.IoC.Models.Publicacion;

public interface PublicacionRepository extends CrudRepository<Publicacion, Long>{
    
}
