class Tiempo(hora: Int, minutos: Int, segundos: Int){
    var hora = hora
    var minutos = minutos
    var segundos = segundos
    init {
        require(hora in (0..13)){"Formato de hora errónea."}
        require(minutos in (0..60)){"Formato de minutos erróneo."}
        require(segundos in (0..60)){"Formato de segundos erróneo."}
    }
    constructor(hora: Int, minutos: Int): this(hora, minutos,0)
    constructor(hora: Int): this(hora, 0,0)

    override fun toString(): String {
        return "$hora:$minutos:$segundos"
    }
}

/*
fun menu(){
    println("****************")
    println("Menú de opciones")
    println("****************")
    println("Elija la opción deseada\n1.Hora:Minutos:segundos\n2.Hora:Minutos\n3.Hora")
}
fun main(args: Array<String>) {
    menu()
    var eleccion = readln().toInt()
    when(eleccion){
        1 -> {
            println("Introduce la hora deseada")
            val hora = readln().toInt()
            println("Introudce los minutos desesados")
            val minuto = readln().toInt()
            println("Introduce los segundos deseados")
            val segundo = readln().toInt()
            var reloj = Tiempo(hora, minuto, segundo)
            println(reloj.toString())
        }
        2 -> {
            println("Introduce la hora deseada")
            val hora = readln().toInt()
            println("Introudce los minutos desesados")
            val minuto = readln().toInt()
            var reloj = Tiempo(hora, minuto)
            println(reloj.toString())
        }
        3 -> {
            println("Introduce la hora deseada")
            val hora = readln().toInt()
            var reloj = Tiempo(hora)
            println(reloj.toString())
        }
    }
}
 */