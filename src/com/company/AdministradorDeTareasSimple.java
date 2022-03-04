//package com.company;
//import javax.swing.JOptionPane;
//
//public class AdministradorDeTareasSimple {
//
//    private static int opcionSeleccionada = -1;
//    private static ListaDeTareas lista = new ListaDeTareas();
//
//    private static String getOpciones() {
//        String opciones = "************************\n";
//        opciones += "Elige opción:\n";
//        opciones += "\t1.- Ver Lista de Tareas\n";
//        opciones += "\t2.- Añadir Tarea\n";
//        opciones += "\t3.- Eliminar Última Tarea\n";
//        opciones += "\t4.- Editar Tarea \n";
//        opciones += "0.- Salir\n";
//        opciones += "************************\n";
//        return opciones;
//    }
//
//    private static void mostrarListaDeTareas() {
//        System.out.println(lista.toString());
//        JOptionPane.showMessageDialog(null, lista.toString());
//    }
//
//    private static void añadirTareaALaLista() {
//        lista.añadirTarea(
//            JOptionPane.showInputDialog(null, "Nombre de la tarea: "),
//            JOptionPane.showInputDialog(null, "Descripción: ")
//        );
//        JOptionPane.showMessageDialog(null, "Se ha añadido la tarea correctamente.");
//    }
//
//    private static void eliminarUltimaTarea() {
//        lista.eliminarTarea();
//        JOptionPane.showMessageDialog(null, "La última tarea se ha eliminado correctamente.");
//    }
//
//    private static void editarTarea() {
//        lista.editarTareaNumero(
//            Integer.parseInt(JOptionPane.showInputDialog(null,"Número de tarea a editar: ")),
//            JOptionPane.showInputDialog(null, "Nombre de la tarea: "),
//            JOptionPane.showInputDialog(null, "Descripción: ")
//        );
//        JOptionPane.showMessageDialog(null, "Los datos de la tarea han sido actualizados correctamente.");
//    }
//
//    private static void finalizarPrograma() {
//        JOptionPane.showMessageDialog(null, "VUELVA PRONTO <3");
//    }
//
//    public static void inicializarPrograma() {
//        while (opcionSeleccionada != 0) {
//            String lectura = JOptionPane.showInputDialog(null, getOpciones());
//            opcionSeleccionada = Integer.parseInt(lectura);
//            switch (opcionSeleccionada) {
//                case 1:
//                    mostrarListaDeTareas();
//                    break;
//                case 2:
//                    añadirTareaALaLista();
//                    break;
//                case 3:
//                    eliminarUltimaTarea();
//                    break;
//                case 4:
//                    editarTarea();
//                    break;
//                default:
//                    finalizarPrograma();
//                    break;
//            }
//        }
//    }
//
//
//
//
//}
