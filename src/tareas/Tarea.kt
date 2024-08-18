package tareas

abstract class Tarea(var descripcion: String) {
    abstract fun imprimirDetalles()
}

interface Asignable {
    fun asignarEmpleado(nombreEmpleado: String)
}

class TareaSimple(descripcion: String) : Tarea(descripcion), Asignable {
    private var empleadoAsignado: String? = null

    override fun imprimirDetalles() {
        println("Descripción: $descripcion")
        println("Empleado Asignado: ${empleadoAsignado ?: "No asignado"}")
    }

    override fun asignarEmpleado(nombreEmpleado: String) {
        empleadoAsignado = nombreEmpleado
        println("Empleado '$nombreEmpleado' asignado a la tarea.")
    }
}

class TareaCompleja(descripcion: String, private var prioridad: Int) : Tarea(descripcion), Asignable {
    private var empleadoAsignado: String? = null

    override fun imprimirDetalles() {
        println("Descripción: $descripcion")
        println("Prioridad: $prioridad")
        println("Empleado Asignado: ${empleadoAsignado ?: "No asignado"}")
    }

    override fun asignarEmpleado(nombreEmpleado: String) {
        empleadoAsignado = nombreEmpleado
        println("Empleado '$nombreEmpleado' asignado a la tarea con prioridad $prioridad.")
    }
}