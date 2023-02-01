class Baraja {
    var baraja = mutableListOf<Carta>()
    init {
        for(numero in 1..13){
            for(palo in 0..3){
                baraja.add(Carta(numero, numeroDePalo(palo)))
            }
        }
    }
    fun mostrar(){
        println("Mostrar baraja")
        for(i in baraja){
            i.mostrarCarta()
        }
    }
}

/*
fun main(args: Array<String>) {
    val baraja1 = Baraja()
    val jugador1 = Mano(3, baraja1)
    val jugador2 = Mano(3, baraja1)
    println("*********************************")
    jugador1.mostrarCarta()


    println("*********************************")
    jugador2.mostrarCarta()
    jugador1.manoGanadora(jugador2)


}
 */