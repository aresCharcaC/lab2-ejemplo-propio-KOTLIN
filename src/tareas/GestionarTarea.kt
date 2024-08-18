package tareas

class GestorTareas {
    private val tareas = mutableListOf<Tarea>()

    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
        println("Tarea añadida: ${tarea.descripcion}")
    }

    fun mostrarTareas() {
        for (tarea in tareas) {
            tarea.imprimirDetalles()
            println()
        }
    }
}