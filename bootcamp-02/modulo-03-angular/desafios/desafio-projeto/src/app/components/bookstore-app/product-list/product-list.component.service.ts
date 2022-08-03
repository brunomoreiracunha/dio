import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Book } from "./model/Book";

@Injectable()

export class BookService
{
    private url = "https://api.itbook.store/1.0";
    
    httpOption = {
        Headers: new HttpHeaders({'content-type' :  'application/json'})
    }
    constructor(private http:HttpClient){

    }

    getBooks(){
        return this.http.get(this.url+"/new")
    }

    getBooksByName(termSearch: string){
        return this.http.get(this.url+"/search/"+termSearch)
    }

    getDetailsBook(idBook: string){
        return this.http.get(this.url+"/books/"+idBook)
    }
}