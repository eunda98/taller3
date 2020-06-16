
package com.example.biblioteca;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancionServiceImp implements CancionService{
    @Autowired
    private CancionRepositorio repositorio;
    
    @Override
    public List<Cancion> listar() {
        return repositorio.findAll();
    }

    @Override
    public Cancion listarId(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Cancion add(Cancion c) {
        return repositorio.save(c);
    }

    @Override
    public Cancion edit(Cancion c) {
        return repositorio.save(c);
    }

    @Override
    public Cancion delete(int id) {
        Cancion c=repositorio.findOne(id);
        if(c!=null){
            repositorio.delete(c);
        }
       return c;
    }
        
}
