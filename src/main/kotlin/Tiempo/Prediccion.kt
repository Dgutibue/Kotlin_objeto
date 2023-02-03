class Prediccion() {
    val dia1 = Dia()
    val dia2 = Dia()
    val dia3 = Dia()
    fun mostrarDia(numero: Int){
        when(numero){
            1 -> dia1.mostrar_prediccion()
            2 -> dia2.mostrar_prediccion()
            3 -> dia3.mostrar_prediccion()
        }
    }
    fun modificarActual(numero: Int){
        when(numero){
            1 -> {
                println("Escriba la temperatura máxima esperada")
                dia1.max = readln().toInt()
                println("Escriba la temperatura mínima esperada")
                dia1.min = readln().toInt()
                println("Escriba la estado esperado")
                dia1.estado = readln()!![0]
            }
            2 -> {
                println("Escriba la temperatura máxima esperada")
                dia2.max = readln().toInt()
                println("Escriba la temperatura mínima esperada")
                dia2.min = readln().toInt()
                println("Escriba la estado esperado")
                dia2.estado = readln()!![0]
            }
            3 -> {
                println("Escriba la temperatura máxima esperada")
                dia3.max = readln().toInt()
                println("Escriba la temperatura mínima esperada")
                dia3.min = readln().toInt()
                println("Escriba la estado esperado")
                dia3.estado = readln()!![0]
            }
        }
    }
}

/*
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
 */