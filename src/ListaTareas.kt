

class ListaTareas {
    val listaTareas: MutableList<Tarea> = mutableListOf()

    fun aniadirTarea(){
        var tare: Tarea
        if (quiereId("¿Quieres introducir un identificador?")){
            listaTareas.add(Tarea(pedirDato("Introduce la id de la tarea >> "),pedirDato("Introduce la descripción de la tarea >> ")))
        } else{
            listaTareas.add(Tarea(descripcion = pedirDato("Introduce la descripción de la tarea >> "),))
        }
    }
    fun eliminarTarea(){
        val id = pedirDato("Introduce la id de la tarea que quieras borrar >> ")
        if (!listaTareas.removeIf { it.id==id }) println("Tarea no existente")
    }
    fun cambiarEstado(){
        val id = pedirDato("Introduce la id de la tarea que quieras cambiar el estado >> ")
        for (tarea in listaTareas){
            if (tarea.id == id){
                tarea.cambiarCompleta()
            }
        }
    }

    fun mostrarLista(){
        println("Lista de tareas:")
        for (tarea in listaTareas){
            if (tarea.fechaCompletada != null) println("Tarea '${tarea.id}': ${tarea.descripcion} [${tarea.estado} el ${tarea.fechaCompletada}]") else println("Tarea '${tarea.id}': ${tarea.descripcion} [${tarea.estado}]" )

        }
    }



}