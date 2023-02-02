class Producto (){
    var nombre: String = ""
        get() = field
        set(value) {
            field = value
            if(field == ""){
                do {
                    println("Error, Introduzca el nombre del producto")
                    field = readln()
                }while(field == "")
            }
        }

    var serie: Int = generar()
        get() = field

    var precio: Double = 0.0
        get() = field
        set(value) {
            field = value
            if(field <= 0.0){
                do {
                    println("Error, Introduzca el precio del producto")
                    field = readln().toDouble()
                }while(field <= 0.0)
            }
        }

    constructor(nombreC2_: String, precioC2_: Double):this(){
        this.nombre = nombreC2_
        this.precio = precioC2_
        if(this.nombre == "" || this.precio <= 0.0){
            do {
                println("Error, Introduzca el nombre del producto")
                this.nombre = readln()
                println("Error, Introduzca el precio del producto")
                this.precio = readln().toDouble()
            }while(this.nombre == "" || this.precio <= 0)
        }
    }

    private fun generar(): Int{
        val serie = (1..1000).random()
        return serie
    }
    fun resumen(){
        println("INFORME DEL PRODUCTO")
        println("____________________")
        println("Nombre: $nombre\nSerie: $serie\nPreico: $precio€")
        println()
    }
    fun iguales(otroProducto: Producto): Boolean{
        if(this.nombre == otroProducto.nombre){
            if(this.serie == otroProducto.serie){
                return true
            }else return false
        }else return false
    }
}

/*
fun main(args: Array<String>) {
    /*
    val producto1 = Producto()
    val producto2 = Producto("Arroz",2.4)
    producto1.nombre = "Pizza"
    producto1.precio = 12.3
    producto1.resumen()
    println()
    producto2.resumen()
    println(producto1.iguales(producto2))
     */
    val pedido1 = Pedido()
    do{
        println("Introduce el numero del producto (del 1 al 3)")
        var numero = readln().toInt()
        pedido1.pedirProducto(numero)
    }while(pedido1.pedido.size < 3)
    pedido1.pedido[0].iguales(pedido1.pedido[2])
    pedido1.mostrarPedido()
}
 */