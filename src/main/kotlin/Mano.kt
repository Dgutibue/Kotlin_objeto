class Mano(tamanio: Int) {
    var cartas = mutableListOf<Carta>()


    constructor(tamanio: Int, baraja: Baraja) : this(tamanio) {
        while (cartas.size < tamanio) {
            cartas.add(baraja.baraja.random())
            for(i in cartas){
                if(i in baraja.baraja){
                    baraja.baraja.remove(i)
                }
            }
        }
    }


    fun mostrarCarta() {
        for (i in cartas) {
            i.mostrarCarta()
        }

    }
    fun mostrarMesa(){
        for (i in mesa) {
            i.mostrarCarta()
        }
    }
    fun manoGanadora(otra : Mano){
        var jugador1 = 0
        var jugador2 = 0
        for(i in 0..2){
            if(cartas[i].compararCarta(otra.cartas[i]) == 1) {
                jugador1 ++
            }else jugador2 ++
        }
        if(jugador1 > jugador2){
            println("Jugador 1 ganador con $jugador1 puntos")
        }else println("Jugador 2 ganador con $jugador2 puntos")
        /*
       total+= cartas[0].compararCarta(otra.cartas[0])
        total+= cartas[1].compararCarta(otra.cartas[1])
        total+= cartas[2].compararCarta(otra.cartas[2])

         */

    }

    fun echarCarta(numero: Int) {
        if (cartas.size == 3) {
            when (numero) {
                1 -> {
                    println("Se echa la carta:")
                    cartas[0].mostrarCarta()
                    mesa.add(cartas[0])
                    cartas.removeAt(0)
                }

                2 -> {
                    println("Se echa la carta:")
                    cartas[1].mostrarCarta()
                    mesa.add(cartas[1])
                    cartas.removeAt(1)
                }

                3 -> {
                    println("Se echa la carta:")
                    cartas[2].mostrarCarta()
                    mesa.add(cartas[2])
                    cartas.removeAt(2)
                }
            }
        } else if (cartas.size == 2) {
            when (numero) {
                1 -> {
                    println("Se echa la carta:")
                    cartas[0].mostrarCarta()
                    mesa.add(cartas[0])
                    cartas.removeAt(0)
                }

                2 -> {
                    println("Se echa la carta:")
                    cartas[1].mostrarCarta()
                    mesa.add(cartas[1])
                    cartas.removeAt(1)
                }
            }
        } else if (cartas.size == 1) {
            when (numero) {
                1 -> {
                    println("Se echa la carta:")
                    cartas[0].mostrarCarta()
                    mesa.add(cartas[0])
                    cartas.removeAt(0)
                }
            }

            println("Te quedan las cartas:")
            for (i in cartas) {
                i.mostrarCarta()
            }
        }

    }

}
var mesa = mutableListOf<Carta>()
/*
fun main(args: Array<String>) {
    val baraja1 = Baraja()
    val jugador1 = Mano(3,baraja1)
    val jugador2 = Mano(3,baraja1)
    var juego = 0
    while(juego < 1){
        println("*********************************")
        jugador1.mostrarCarta()
        jugador1.echarCarta(2)

        println("*********************************")
        jugador2.mostrarCarta()
        jugador2.echarCarta(1)

        juego ++
    }

}


 */