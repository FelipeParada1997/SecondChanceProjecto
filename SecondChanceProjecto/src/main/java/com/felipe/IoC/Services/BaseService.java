package com.felipe.IoC.Services;

import com.felipe.IoC.Repositories.BaseRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
<<<<<<< Updated upstream
public abstract class BaseService<T> implements IService<T>{
=======
public class BaseService<T> {
>>>>>>> Stashed changes
    private final BaseRepository<T> baseRepository;

    public BaseService(BaseRepository<T> baseRepository) {
        this.baseRepository = baseRepository;
    }
//-----------------------------------------------------------------------------------------------
    @Override
    public void delete(Long id) {
        T entity = findById(id);
        if(entity != null){
            baseRepository.delete(entity);
        }
    }

    @Override
    public List<T> findAll() {
    return baseRepository.findAll();
    }

    @Override
    public T findById(Long id) {
        Optional<T> op = baseRepository.findById(id);
        return op.isPresent() ? op.get() : null;
    }

    @Override
    public T save(T entity) {
        return baseRepository.save(entity);
    }

    @Override
    public T update(T entity) {
        return baseRepository.save(entity);
    }

}
