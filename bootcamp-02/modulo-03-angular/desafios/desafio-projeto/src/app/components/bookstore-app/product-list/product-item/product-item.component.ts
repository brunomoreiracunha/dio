import { Component, Input, OnInit } from '@angular/core';
import { Book } from '../model/Book';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-product-item',
  templateUrl: './product-item.component.html',
  styleUrls: ['./product-item.component.css'],
})
export class ProductItemComponent implements OnInit {
  @Input()
  livro!: Book;

  closeResult!: string;

  constructor(private modalService: NgbModal) {}

  open(content: any) {
    this.modalService
      .open(content, { ariaLabelledBy: 'modal-livro-titulo', centered: true, scrollable: true, animation: true })
      .result.then(
        (result) => {
          this.closeResult = `Closed with: ${result}`;
        },
        (reason) => {
          this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
        }
      );
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'pressionou ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'clicou fora do Modal';
    } else {
      return `Motivo: ${reason}`;
    }
  }

  ngOnInit(): void {}
}
