package tareas

fun main() {
    val tarea1 = TareaSimple("Hacer informe mensual")
    println("----------------------------------------")
    val tarea2 = TareaCompleja("Desarrollar nueva funcionalidad", 1)
    println("----------------------------------------")
    val gestorTareas = GestorTareas()
    println("----------------------------------------")
    gestorTareas.agregarTarea(tarea1)
    gestorTareas.agregarTarea(tarea2)

    tarea1.asignarEmpleado("Juan Pérez")
    tarea2.asignarEmpleado("Ana Martínez")

    println("------Lista de Tareas------")
    gestorTareas.mostrarTareas()
}
