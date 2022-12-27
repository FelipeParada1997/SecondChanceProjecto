package com.felipe.IoC.Services;

import com.felipe.IoC.Repositories.BaseRepository;

import java.util.List;
import java.util.Optional;

public class BaseService<T> {
    private final BaseRepository<T> baseRepository;

    public BaseService(BaseRepository<T> baseRepository) {
        this.baseRepository = baseRepository;
    }

    public T findById(Long id){
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

    public void saveAll(List<T> objeto) {
        baseRepository.saveAll(objeto);
    }

    public T save (T objeto) {
        try {
            return baseRepository.save(objeto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean destroy(Long id) {
        T objeto = findById(id);
        if(objeto != null) {
            baseRepository.delete(objeto);
            return true;
        }
        return false;
    }
}
