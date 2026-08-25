import { Component } from '@angular/core';

@Component({
  selector: 'app-task-list',
  imports: [],
  templateUrl: './task-list.html',
  styleUrl: './task-list.css'
})
export class TaskList {

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