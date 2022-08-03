import { Component, Input, OnChanges, SimpleChanges } from '@angular/core';
import { Book } from './model/Book';
import { BookService } from './product-list.component.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnChanges {
  @Input() 
  termoBusca!: string;
  
  tempLivros : any;
  detalhes: any;
  livros: Book[] = [];
  bookService : BookService;

  constructor( bookService : BookService) { 
    this.bookService = bookService;
  }

  ngOnChanges(changes: SimpleChanges): void {
    
    if(changes['termoBusca'].currentValue === ""){
      this.carregarLivrosNovos();
    }else{
      this.carregarLivroPorBusca(changes['termoBusca'].currentValue);
    }
  }

  carregarLivrosNovos(): void{
    this.livros = [];
    this.tempLivros = this.bookService.getBooks().subscribe(
      (data => {
        this.tempLivros = data;
        this.tempLivros = this.tempLivros.books;

        this.tempLivros.forEach((livro: any) => {
          this.detalhes = this.bookService.getDetailsBook(livro.isbn13).subscribe(
            (data => {
              this.detalhes = data;
              this.livros.push(this.detalhes);
          }))

        });
    }));
  }
  
  carregarLivroPorBusca(termo: string): void{
    this.livros = [];
    this.tempLivros = this.bookService.getBooksByName(termo).subscribe(
      (data => {
        this.tempLivros = data;
        this.tempLivros = this.tempLivros.books;

        this.tempLivros.forEach((livro: any) => {
          this.detalhes = this.bookService.getDetailsBook(livro.isbn13).subscribe(
            (data => {
              this.detalhes = data;
              this.livros.push(this.detalhes);
          }))

        });
    }));
  }
}
