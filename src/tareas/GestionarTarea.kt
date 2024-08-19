package tareas

class GestorTareas {
    private val tareas = mutableListOf<Tarea>()

    init {
        println("Gestor de Tareas creado. Lista de tareas inicializada.")
    }

    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
        println("Tarea añadida: ${tarea.descripcion}")
    }

    fun mostrarTareas() {
        if (tareas.isEmpty()) {
            println("No hay tareas para mostrar.")
        } else {
            for (tarea in tareas) {
                tarea.imprimirDetalles()
                println()
            }
        }
    }
}
