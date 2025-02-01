fun pedirOpcion(numOpciones: Int): Int {
    var opcion: Int = -1
    do {
        println("Introduce una de las $numOpciones opciones >> ")
        opcion = readln().toInt()
    } while (opcion !in 1..numOpciones)
    return opcion
}

fun pedirDato(msj: String): String{
    print(msj)
    return readln()
}
fun quiereId(msj: String): Boolean {
    while (true) {
        print("$msj (Sí/No) >> ")
        val respuesta = readln().lowercase()

        when (respuesta) {
            "sí", "si", "s" -> return true
            "no", "n" -> return false
            else -> println("Debe ser sí o no")
        }
    }
}
fun mostraMenu(){
    println("Menu Gestor de Tareas:\n1.Agregar tarea.\n2.Eliminar tarea:\n3.Cambiar estado de una tarea.\n4.Mostrar lista.\n5.Salir.")
}


fun main(){
    val listaTareas = ListaTareas()
    var salir = false
    while (salir == false) {
        mostraMenu()
        val opcion = pedirOpcion(5)
        when (opcion){
            1 -> listaTareas.aniadirTarea()
            2 -> listaTareas.eliminarTarea()
            3 -> listaTareas.cambiarEstado()
            4 -> listaTareas.mostrarLista()
            5 -> salir = true
        }
        print("Presiona ENTER para continuar...")
        readln()
    }
    println("FIN DEL PROGRAMA")

}