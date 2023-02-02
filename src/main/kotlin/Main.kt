fun main(args: Array<String>) {
    val dia = Dia()
    dia.estado = 'r'
    println(dia.estado)
    println("***************************")
    val dia2 = Dia(15,30,'p')
    println(dia2.estado)
    println("**************************")
    dia2.mostrar_prediccion()
    println("**************************")
    dia2.temperaturaActual()
}

