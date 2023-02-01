class rectangulo {
    var altura = 0F
    var base = 0F
    fun area():Float{
        var area = base * altura
        return area
    }
    fun perimetro():Float{
        var perimetro = (base * 2) + (altura * 2)
        return perimetro
    }
    fun imprimir(){
        println("El área del rectángulo es: ${area()}")
        println("El perímetro del rectángulo es: ${perimetro()}")
    }

    override fun toString(): String {
        return "El área del rectángulo es: ${area()}\nEl perímetro del rectángulo es: ${perimetro()}"
    }
}

/*
fun main(args: Array<String>) {
    println("Rectángulo 1:")
    val rectangulo1 = rectangulo()
    rectangulo1.altura = 12F
    rectangulo1.base = 5F
    rectangulo1.area()
    rectangulo1.perimetro()
    rectangulo1.imprimir()
    rectangulo1.toString()
    println("Rectángulo 2:")
    val rectangulo2 = rectangulo()
    rectangulo2.altura = 27F
    rectangulo2.base = 7.7F
    rectangulo2.area()
    rectangulo2.perimetro()
    rectangulo2.imprimir()
    rectangulo2.toString()
}
 */