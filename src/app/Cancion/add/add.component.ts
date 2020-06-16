import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Cancion } from 'src/app/Modelo/Cancion';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  cancion:Cancion=new Cancion();
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  Guardar(){
    this.service.createCancion(this.cancion)
    .subscribe(data=>{
      alert("Se Agrego con Exito");
      this.router.navigate(["listar"]);
    })
  }

}
