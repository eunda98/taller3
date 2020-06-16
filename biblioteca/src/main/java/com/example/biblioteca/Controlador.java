
package com.example.biblioteca;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/canciones"})
public class Controlador {
    
    @Autowired
    CancionService service;
    
    @GetMapping
    public List<Cancion>listar(){
        return service.listar();
    }
    @PostMapping
    public Cancion agregar(@RequestBody Cancion c){
        return service.add(c);
    }
    @GetMapping(path = {"/{id}"})
    public Cancion listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PutMapping(path = {"/{id}"})
    public Cancion editar(@RequestBody Cancion c,@PathVariable("id") int id){
        c.setId(id);
        return service.edit(c);
    }
    @DeleteMapping(path = {"/{id}"})
    public Cancion delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
