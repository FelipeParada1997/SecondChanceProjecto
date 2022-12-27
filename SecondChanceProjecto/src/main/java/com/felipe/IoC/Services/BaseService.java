package com.felipe.IoC.Services;

import com.felipe.IoC.Repositories.BaseRepository;

import java.util.List;
import java.util.Optional;

public class BaseService<T> {
    private final BaseRepository<T> baseRepository;

    public BaseService(BaseRepository<T> baseRepository) {
        super();
        this.baseRepository = baseRepository;
    }

    public T buscarId(Long id){
        Optional<T> optional = baseRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

    public List<T> listado(){
        return baseRepository.findAll();
    }

    public void guardarTodos(List<T> objeto) {
        baseRepository.saveAll(objeto);
    }

    public T guardar (T objeto) {
        try {
            return baseRepository.save(objeto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean eliminar(Long id) {
        T objeto = buscarId(id);
        if(objeto != null) {
            baseRepository.delete(objeto);
            return true;
        }
        return false;
    }
}
