package com.company;
public class ListaDeTareas {
    
	private TareaEnlazable primeraTarea;

    public ListaDeTareas() {
        this.primeraTarea = null;
    }

    public void añadirTarea(String titulo, String descripcion) {
        if (this.noHayTareas()) {
            this.primeraTarea = new TareaEnlazable(titulo, descripcion);
            return;
        }
        TareaEnlazable tareaTemporal = primeraTarea;
        TareaEnlazable nuevaTarea = new TareaEnlazable(titulo, descripcion);
        nuevaTarea.enlazarSiguiente(tareaTemporal);
        this.primeraTarea = nuevaTarea;
    }

    public void añadirTarea(TareaEnlazable nuevaTarea) {
        if (this.noHayTareas()) {
            this.primeraTarea = nuevaTarea;
            return;
        }
        TareaEnlazable tareaTemporal = primeraTarea;
        nuevaTarea.enlazarSiguiente(tareaTemporal);
        this.primeraTarea = nuevaTarea;
    }

    private boolean noHayTareas() {
        return this.primeraTarea == null;
    }

    public void eliminarTarea(int indice) {
    if (indice ==0){
        primeraTarea = primeraTarea.obtenerSiguienteTarea();
    }else{
        int contador = 0;
        TareaEnlazable tareaTemporal = primeraTarea;
        while (contador<indice-1){
            tareaTemporal = tareaTemporal.obtenerSiguienteTarea();
            contador++;
        }
        tareaTemporal.enlazarSiguiente(tareaTemporal.obtenerSiguienteTarea());
    }
    }

    public void editarTareaNumero(int indice, String nuevoTitulo, String nuevaDescription) {
        TareaEnlazable tareaSeleccionada = this.primeraTarea;
        for (int i = 0; i < indice-1; i++) {
            tareaSeleccionada = tareaSeleccionada.obtenerSiguienteTarea();
        }
        tareaSeleccionada.editarTarea(nuevoTitulo, nuevaDescription);
    }

    @Override
    public String toString() {
        return "###############################\n" +
            "\t\t\tLista De Tareas\n" +
            "###############################\n" +
            "Primera tarea: \n" + primeraTarea + 
            "\n###############################\n";
    }
}