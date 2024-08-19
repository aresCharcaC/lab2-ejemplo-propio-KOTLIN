package tareas

abstract class Tarea(private var _descripcion: String) {
    var descripcion: String
        get() = _descripcion
        set(value) {
            _descripcion = value
        }

    init {
        println("Tarea creada con descripción: $descripcion")
    }

    abstract fun imprimirDetalles()
}

interface Asignable {
    fun asignarEmpleado(nombreEmpleado: String)
}

class TareaSimple(descripcion: String) : Tarea(descripcion), Asignable {
    private var _empleadoAsignado: String? = null
    var empleadoAsignado: String?
        get() = _empleadoAsignado
        set(value) {
            _empleadoAsignado = value
        }

    init {
        println("Tarea Simple creada con descripción: $descripcion")
    }

    override fun imprimirDetalles() {
        println("Descripción: $descripcion")
        println("Empleado Asignado: ${empleadoAsignado ?: "No asignado"}")
    }

    override fun asignarEmpleado(nombreEmpleado: String) {
        empleadoAsignado = nombreEmpleado
        println("Empleado '$nombreEmpleado' asignado a la tarea.")
    }
}

class TareaCompleja(descripcion: String, prioridad: Int) : Tarea(descripcion), Asignable {
    private var _prioridad: Int = prioridad
    var prioridad: Int
        get() = _prioridad
        set(value) {
            _prioridad = value
        }

    private var _empleadoAsignado: String? = null
    var empleadoAsignado: String?
        get() = _empleadoAsignado
        set(value) {
            _empleadoAsignado = value
        }

    init {
        println("Tarea Compleja creada con descripción: $descripcion y prioridad: $prioridad")
    }

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
