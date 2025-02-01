import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
class Tarea(
    id: String = "",
    val descripcion: String,
) {
    val id: String = if (id.isNotEmpty()) id else cont.toString()
    var estado: Estado = Estado.PENDIENTE
    var fechaCompletada: String? = null

    init {
        cont++
    }
    companion object{
        var cont = 1
        val formateo = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
    }

    fun cambiarCompleta(){
        estado = Estado.COMPLETADA
        fechaCompletada = LocalDateTime.now().format(formateo)
    }
    override fun toString(): String {
        return "Tarea(id='$id', descripción='$descripcion, estado=$estado)')"
    }
}