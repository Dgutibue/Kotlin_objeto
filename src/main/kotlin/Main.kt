fun main(args: Array<String>) {
    val pedido1 = Pedido()
    do{
        println("Introduce el numero del producto (del 1 al 3)")
        var numero = readln().toInt()
        pedido1.pedirProducto(numero)
    }while(pedido1.pedido.size < 3)
    pedido1.pedido[0].iguales(pedido1.pedido[2])
    pedido1.mostrarPedido()
}
