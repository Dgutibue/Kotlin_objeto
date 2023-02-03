class Dia(){
    var min: Int = 25
        get() {
            return field
        }
    var max: Int =10
        get() {
            return field
        }
    var estado: Char = 's'
        get() {
            return field
        }
        set(value) {
            val Lista = listOf<Char>('s','n','l')
            field = value
            if(field !in Lista){
                do{
                    println("Caracter erróneo, ingrese (s, n o l)")
                    field = readln()!![0].lowercaseChar()
                }while(field !in Lista)
            }
        }
    constructor(min2: Int, max2: Int, estado2: Char):this() {
        min = min2
        max = max2
        estado = estado2
    }
    constructor(otroDia: Dia):this()
    fun mostrar_prediccion(){
        var es = ""
        when (estado){
            's' -> es = "soleado"
            'n' -> es = "nublado"
            'l' -> es = "lluvioso"
        }
        println("Se espera un día $es con temperatura máxima de $max grados y con unas mínimas de $min grados")
    }
    fun temperaturaActual(){
        println("Ingrese la temperatura actual")
        var temperatura = readln().toInt()
        if(temperatura > max){
            max = temperatura
            println("Se ha superado la temperatura máxima alcanzando los $max grados")
        }else if(temperatura > min && temperatura < max){
            min = temperatura
            println("Se ha superado la temperatura mínima alcanzando los $min grados, aunque se espera alcanzar los $max")
        }else {
            min = temperatura
            println("Hace un día anormalmente frío con una temperatura de $min grados")
        }
    }
}