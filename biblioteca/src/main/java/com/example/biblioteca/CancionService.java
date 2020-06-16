
package com.example.biblioteca;

import java.util.List;

public interface CancionService {
    List<Cancion>listar();
    Cancion listarId(int id);
    Cancion add(Cancion c);
    Cancion edit(Cancion c);
    Cancion delete(int id);
}
