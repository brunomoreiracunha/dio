import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-filters',
  templateUrl: './filters.component.html',
  styleUrls: ['./filters.component.css']
})
export class FiltersComponent implements OnInit {
  @Output() termoBusca = new EventEmitter<string>();
  
  termo!: string;

  constructor() { }

  ngOnInit(): void {
  }

  busca(termo: string){
    this.termo = termo;
    this.termoBusca.emit(termo);
  };

}
