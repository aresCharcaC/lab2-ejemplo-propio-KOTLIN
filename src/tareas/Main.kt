package tareas

fun main() {
    val tarea1 = TareaSimple("Hacer informe mensual")
    val tarea2 = TareaCompleja("Desarrollar nueva funcionalidad", 1)

    val gestorTareas = GestorTareas()

    gestorTareas.agregarTarea(tarea1)
    gestorTareas.agregarTarea(tarea2)

    tarea1.asignarEmpleado("Juan Pérez")
    tarea2.asignarEmpleado("Ana Martínez")

    gestorTareas.mostrarTareas()
}
