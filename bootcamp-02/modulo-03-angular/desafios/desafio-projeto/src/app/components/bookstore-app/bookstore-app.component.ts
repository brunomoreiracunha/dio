import { Component } from '@angular/core';

@Component({
  selector: 'app-bookstore-app',
  templateUrl: './bookstore-app.component.html',
  styleUrls: ['./bookstore-app.component.css']
})
export class BookstoreAppComponent {
  termoBusca: string = "";

  constructor() { }
  
  searchByTerm(termo: string){
    this.termoBusca = termo;
  }
}