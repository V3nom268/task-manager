import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  imports: [],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  title = 'Task Manager';

  tasks = [
    {
      title: 'Aprender Spring Boot',
      description: 'Crear mi primera API REST',
      completed: false
    },
    {
      title: 'Aprender Angular',
      description: 'Crear el frontend de Task Manager',
      completed: false
    }
  ];
}