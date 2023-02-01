class Coche(color: String, marca: String, modelo: String, potencia: Int, puertas: Int, matricula: String ) {
    var color = ""
        set(value) {
            println("¿Desea cambiar el color? S/N")
            val respuesta = readln()
            if (respuesta.uppercase() == "S"){
                println("¿Qué color desea?")
                field = readln()
            }else field = value
        }
        get() {
            return field
        }
    var marca = marca
    var modelo = modelo
    var potencia = potencia
    var puertas = puertas
    var matricula = matricula

init {
    this.color = color
}
    constructor(color: String, marca: String, modelo: String, potencia: Int, puertas: Int):this(color, marca, modelo, potencia, puertas, "0")

    override fun toString(): String {
        return "El coche es de la marca $marca, de color $color con una potencia de $potencia cavallos, con $puertas puertas, teniendo la matrícula $matricula"
    }
}


/*
fun main(args: Array<String>) {
    val coche1 = Coche("Rojo", "Toyota", "CHR", 135, 5, "5563LTM" )
    val coche2 = Coche("Amarillo", "Citroen","Xara", 100, 5)
    println(coche1.toString())
    println(coche2.toString())
}

 */