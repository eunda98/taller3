import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service'
import { Cancion } from 'src/app/Modelo/Cancion';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  canciones: Cancion[];
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit() {
    this.service.getCanciones()
      .subscribe(data => {
        this.canciones = data;
      });
  }
  Editar(cancion:Cancion):void{
    localStorage.setItem("id",cancion.id.toString());
    this.router.navigate(["edit"]);
  }

  Delete(cancion:Cancion){
    this.service.deleteCancion(cancion)
    .subscribe(data=>{
      this.canciones=this.canciones.filter(c=>c!==cancion);
      alert("Cancion eliminada...");
    })
  }

}
