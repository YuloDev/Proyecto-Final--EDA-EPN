package com.company;
public class TareaEnlazable extends Tarea {

    private TareaEnlazable siguienteTarea;

    public TareaEnlazable(String titulo, String descripcion) {
        super(titulo, descripcion);
    }
    
    public void enlazarSiguiente(TareaEnlazable siguienteTarea) {
        this.siguienteTarea = siguienteTarea;
    }
    
    public TareaEnlazable obtenerSiguienteTarea() {
        return this.siguienteTarea;
    }
    
    @Override
    public String toString() {
        return "---------------------------\n" + 
        super.toString() + 
        "\n---------------------------\n" +
        "\nSiguiente Tarea:\n" + this.siguienteTarea;
    }

}
