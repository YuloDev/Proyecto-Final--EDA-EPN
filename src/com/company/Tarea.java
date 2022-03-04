package com.company;
public class Tarea {

    private String titulo;
    private String descripcion;

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public void editarTarea(String nuevoTitulo, String nuevaDescripcion) {
        this.setTitulo(nuevoTitulo);
        this.setDescripcion(nuevaDescripcion);
    }
    
    private void setTitulo(String nuevoTitulo) {
        if(nuevoTitulo == null) {
            return;
        }
        this.titulo = nuevoTitulo;
    }

    private void setDescripcion(String nuevaDescripcion) {
        if(nuevaDescripcion == null) {
            return;
        }
        this.descripcion = nuevaDescripcion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    
    @Override
    public String toString() {
        return "\tTítulo: " + this.titulo + 
        "\n\tDescripción: "+ this.descripcion;
    }

}