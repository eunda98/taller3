
package com.example.biblioteca;


import java.util.List;
import org.springframework.data.repository.Repository;

public interface CancionRepositorio extends Repository<Cancion, Integer>{
    List<Cancion>findAll();
    Cancion findOne(int id);
    Cancion save(Cancion c);
    void delete(Cancion c);
}
