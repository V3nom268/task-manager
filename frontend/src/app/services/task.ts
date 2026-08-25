import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Task as TaskModel } from '../models/task';

@Injectable({
  providedIn: 'root'
})
export class Task {

  private apiUrl = 'http://localhost:8080/api/tasks';

  constructor(private http: HttpClient) {}

  getTasks(): Observable<TaskModel[]> {
    return this.http.get<TaskModel[]>(this.apiUrl);
  }
}