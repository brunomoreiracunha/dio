import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { USUARIOS } from './mock-usuarios';
import { Usuario } from './usuario';

@Injectable({
  providedIn: 'root',
})
export class UsuarioService {
  private usuarioUrl: string = 'http://localhost:3100/api/usuarios';

  constructor(private httpClient: HttpClient) {}

  getUsuarios(): Usuario[] {
    return USUARIOS;
  }

  retriveAll(): Observable<Usuario[]> {
    return this.httpClient.get<Usuario[]>(this.usuarioUrl);
  }
  retriveById(id: number): Observable<Usuario> {
    return this.httpClient.get<Usuario>(`${this.usuarioUrl}/${id}`);
  }
  save(usuario: Usuario): Observable<Usuario> {
    if (usuario.id) {
      return this.httpClient.put<Usuario>(
        `${this.usuarioUrl}/${usuario.id}`,
        usuario
      );
    } else {
      return this.httpClient.post<Usuario>(`${this.usuarioUrl}`, usuario);
    }
  }
  deleteById(id: number): Observable<any> {
    return this.httpClient.delete<any>(`${this.usuarioUrl}/${id}`);
  }
}
