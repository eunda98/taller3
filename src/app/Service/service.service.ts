import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Cancion } from '../Modelo/Cancion';

@Injectable()
export class ServiceService {

  
  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/biblioteca/canciones';

  getCanciones(){
    return this.http.get<Cancion[]>(this.Url);
  }
  createCancion(cancion:Cancion){
    return this.http.post<Cancion>(this.Url,cancion);
  }
  getCancionId(id:number){
    return this.http.get<Cancion>(this.Url+"/"+id);
  }
  updateCancion(cancion:Cancion){
    return this.http.put<Cancion>(this.Url+"/"+cancion.id,cancion);
  }
  deleteCancion(cancion:Cancion){
    return this.http.delete<Cancion>(this.Url+"/"+cancion.id);
  }
}
