class Carta(numero: Int, palo: Char) {
    var numero: Int = numero
        set(value) {
            if (value !in 1..13) {
                println("Numero de carta inválido.")
            } else
                field = value
        }
        get() {
            return field
        }
    var palo: Char = palo
        set(value) {
            //'C','P', 'R', 'T'
            val l = listOf<Char>('C', 'P', 'R', 'T')
            if (value !in l) {
                println("Palo de carta inválido.")
            } else
                field = value
        }
        get() {
            return field
        }

/*
    constructor(otraCarta: Carta) : this(otraCarta.numero, otraCarta.palo) {
    }

 */

    fun mostrarCarta() {
        var paloMostrar = ""
        var numeroMostrar = ""
        when {
            palo == 'C' -> paloMostrar = "Corazones"
            palo == 'P' -> paloMostrar = "Picas"
            palo == 'R' -> paloMostrar = "Rombos"
            palo == 'T' -> paloMostrar = "Trebol"
        }
        when {
            numero == 1 -> numeroMostrar = "As"
            numero in (2..10) -> numeroMostrar = numero.toString()
            numero == 11 -> numeroMostrar = "Jack"
            numero == 12 -> numeroMostrar = "Reina"
            numero == 13 -> numeroMostrar = "Rey"
        }
        println("$numeroMostrar de $paloMostrar ")
    }

    fun compararCarta(otraCarta: Carta):Int {
        /*
        var numero2 = this.numero
        var palo2 = this.palo

         */
        if (this.numero > otraCarta.numero) {
            print("La carta mayor es: ")
            this.mostrarCarta()
            return -1
        } else if (this.numero < otraCarta.numero)
            print("La carta mayor es: ")
            otraCarta.mostrarCarta()
            return 1
        }
    }


fun numeroDePalo(num:Int): Char{
    val l = listOf<Char>('C', 'P', 'R', 'T')
    if(num >= 0 && num <= 3){
        return l.get(num)
    }else return l.get(0)
}
/*
fun main(args: Array<String>) {
    println("Carta numero 1:")
    val numero1 = readln().toInt()
    val palo1 = readLine()!!.uppercase()!![0]
    val carta1 = Carta(numero1, palo1)
    println(carta1.mostrarCarta())
    println("Carta numero 2:")
    val carta2 = Carta(carta1)
    carta2.numero = readln().toInt()
    carta2.palo = readLine()!!.uppercase()!![0]
    println(carta2.mostrarCarta())
    println(carta1.compararCarta(carta2))
}

fun compararCarta(otraCarta: Carta):Int {
        /*
        var numero2 = this.numero
        var palo2 = this.palo

         */
        if (this.numero > otraCarta.numero) {
            print("La carta mayor es: ")
            mostrarCarta()
            return -1
        } else if (this.numero < otraCarta.numero) {
            print("La carta mayor es: ")
            mostrarCarta()
            return 1
        } else {
            if (this.palo > otraCarta.palo) {
                print("La carta mayor es: ")
                mostrarCarta()
                return -1
            } else {
                print("La carta mayor es: ")
                mostrarCarta()
                return 1
            }
        }
 */