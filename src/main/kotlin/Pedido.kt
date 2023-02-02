class Pedido {
    var pedido: MutableList<Producto> = mutableListOf()
        set(value) {
            field = value
            if(field.size < 3){
                println("Error, la lista debe de contener 3 artículos")
            }
        }
    fun pedirProducto(numero: Int){
        val producto = Producto()
        when(numero){
            1 -> {
                println("Introduzca el nombre del producto")
                producto.nombre = readln()
                println("Introduzca el precio del producto")
                producto.precio = readln().toDouble()
                pedido.add(0,producto)
            }
            2 -> {
                println("Introduzca el nombre del producto")
                producto.nombre = readln()
                println("Introduzca el precio del producto")
                producto.precio = readln().toDouble()
                pedido.add(1,producto)
            }
            3 -> {
                println("Introduzca el nombre del producto")
                producto.nombre = readln()
                println("Introduzca el precio del producto")
                producto.precio = readln().toDouble()
                pedido.add(2,producto)
            }
            else -> println("Error, introduzca un número del 1 al 3")
        }
    }
    fun total(){
        var total = 0.0
        for(i in pedido){
            total += i.precio
        }
        println("La suma total de los productos es: $total€")
    }
    fun mostrarPedido(){
        for(i in pedido){
            i.resumen()
        }
    }
}