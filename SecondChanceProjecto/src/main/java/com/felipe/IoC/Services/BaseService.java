package com.felipe.IoC.Services;

public class BaseService<T> {
    private final RepositorioBase<T> repositorioBase;

    public ServicioBase(RepositorioBase<T> repositorioBase) {
        super();
        this.repositorioBase = repositorioBase;
    }

    public T buscarId(Long id){
        Optional<T> optional = repositorioBase.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

    public List<T> listado(){
        return repositorioBase.findAll();
    }

    public void guardarTodos(List<T> objeto) {
        repositorioBase.saveAll(objeto);
    }

    public T guardar (T objeto) {
        try {
            return repositorioBase.save(objeto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean eliminar(Long id) {
        T objeto = buscarId(id);
        if(objeto != null) {
            repositorioBase.delete(objeto);
            return true;
        }
        return false;
    }
}
