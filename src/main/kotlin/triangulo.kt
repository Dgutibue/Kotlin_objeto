class triangulo(base: Int, altura: Int) {
    var base: Int
    var altura: Int
init {
    this.base = base
    this.altura = altura
    println("Primario")
}
    constructor():this(0, 0){
        println("Sin parametros")
    }
    constructor(base:Int):this(base,0){
        println("Solo con base.")

    }
    fun perimetro():Int{
        return (base+altura)
    }
}