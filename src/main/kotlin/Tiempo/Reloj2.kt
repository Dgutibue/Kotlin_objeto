class Reloj2 {
    var hora = Hora()
    fun menu(){
        do {
            println("Reloj")
            println("-----")
            println("1.Mostrar hora 12\n2.Mostrar hora 24\n3.Modificar horas\n4.Modificar minutos\n5.Modificar segundos\n6.Salir")
            var elegir = readln()
            when (elegir){
                "1" -> hora.mostrar12()
                "2" -> hora.mostrar24()
                "3" -> {
                    println("Ingrese la hora nueva")
                    hora.horas = readln().toInt()
                }
                "4" -> {
                    println("Ingrese los minutos nuevos")
                    hora.minutos = readln().toInt()
                }
                "5" -> {
                    println("Ingrese los segundos nuevos")
                    hora.segundos = readln().toInt()
                }
                "6" -> {
                    println("Gracias por utilizar la aplicación")
                    break
                }
            }
        }while(elegir != "6")
    }
}
/*
fun main(args: Array<String>) {
    var tiempo = Reloj2()
    tiempo.hora = Hora(13,45,33)
    tiempo.menu()
}
 */

/*
fun main(args: Array<String>) {
    var tiempo = Hora()
    var tiempo2 = Hora(23, 54, 60)
    tiempo.horas = 23
    tiempo.minutos = 75
    tiempo.segundos = 80
    tiempo.mostrar24()
    tiempo.mostrar12()
    println("*********************")
    tiempo2.mostrar24()
    tiempo2.mostrar12()

}
 */