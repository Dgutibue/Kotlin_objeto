fun main(args: Array<String>) {
    val lunes = Prediccion()
    val martes = Prediccion()
    val jueves = Prediccion()
    println("Escriba la predicción para el lunes")
    lunes.modificarActual(1)
    println("Escriba la predicción para el martes")
    martes.modificarActual(2)
    println("Escriba la predicción para el jueves")
    jueves.modificarActual(3)
    println("Lunes\n-----")
    lunes.dia1.mostrar_prediccion()
    println("Martes\n------")
    martes.dia2.mostrar_prediccion()
    println("Jueves\n------")
    jueves.dia3.mostrar_prediccion()
    println("Lunes\n-----")
    lunes.dia1.temperaturaActual()
    println("Martes\n------")
    martes.dia2.temperaturaActual()
    println("Jueves\n------")
    jueves.dia3.temperaturaActual()
}

