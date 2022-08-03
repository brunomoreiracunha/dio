import { Component, OnInit } from "@angular/core";
import { Usuario } from "./usuario";

@Component({
    selector: "app-usuario-list",
    templateUrl: "./usuario-list.component.html"
})

export class UsuarioListComponent implements OnInit{
    usuarios: Usuario[] = [];
    
    ngOnInit(): void {
        this.usuarios = [
            {
                id: 1,
                nome: "João",
                email: "joao@email.com",
                imgUrl: "https://cdn.pixabay.com/photo/2017/08/01/01/33/beanie-2562646_960_720.jpg",
                dataAdicionado: "Fevereiro 10, 2022",
                linkRepositorio: "www.repositorio-joao.com.br"
            },
            {
                id: 2,
                nome: "Pedro",
                email: "pedro@email.com",
                imgUrl: "https://cdn.pixabay.com/photo/2018/02/16/14/38/portrait-3157821_960_720.jpg",
                dataAdicionado: "Março 20, 2022",
                linkRepositorio: "www.repositorio-pedro.com.br"
            },
            {
                id: 3,
                nome: "Maria",
                email: "maria@email.com",
                imgUrl: "https://cdn.pixabay.com/photo/2018/01/06/09/25/hijab-3064633_960_720.jpg",
                dataAdicionado: "Setembro 14, 2022",
                linkRepositorio: "www.repositorio-maria.com.br"
            },
            {
                id: 4,
                nome: "Flora",
                email: "flora@email.com",
                imgUrl: "https://cdn.pixabay.com/photo/2016/05/03/16/10/morning-1369446_960_720.jpg",
                dataAdicionado: "Outubro 18, 2022",
                linkRepositorio: "www.repositorio-flora.com.br"
            },
            {
                id: 5,
                nome: "Messias",
                email: "messias@email.com",
                imgUrl: "https://cdn.pixabay.com/photo/2017/12/31/15/56/portrait-3052641_960_720.jpg",
                dataAdicionado: "Dezembro 25, 2022",
                linkRepositorio: "www.repositorio-messias.com.br"
            }
        ]
    }
}