package com.jorge.task_manager.model;
import java.time.LocalDateTime;
//Declaracion de atributos de la clase Task
public class Task {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;
//Constructor vacio de la clase Task por defecto para poder crear objetos de la clase Task sin necesidad de pasar parametros
    public Task() {
    }
//Constructor de la clase Task inserta datos en los atributos de la clase Task
    public Task(Long id, String title, String description, boolean completed, LocalDateTime createdAt){
 this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.createdAt = createdAt;
    }
   
// Obtencion de los valores de los atributos de la clase Task por medio de los metodos get y set
//getters de la clase Task
    public Long getId() {
    return id;
}

public String getTitle() {
    return title;
}

public String getDescription() {
    return description;
}

public boolean isCompleted() { //aqui se cambio el nombre del metodo de getCompleted a isCompleted para seguir la convención de nombres de los métodos booleanos
    return completed;
}

public LocalDateTime getCreatedAt() {
    return createdAt;
}
//setters de la clase Task
public void setId(Long id) {
    this.id = id;
}

public void setTitle(String title) {
    this.title = title;
}

public void setDescription(String description) {
    this.description = description;
}

public void setCompleted(boolean completed) {
    this.completed = completed;
}

public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
}

}