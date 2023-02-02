class Dia(){
    var min: Int = 0
        get() {
            return field
        }
    var max: Int = 0
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
            do{
                println("Caracter erróneo, ingrese (s, n o l)")
                field = readln()!![0]
            }while(field !in Lista)
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
        println("Se espera un día $es con temperatura máxima $max y con unas mínimas de $min")
    }
    fun temperaturaActual(){
        println("Ingrese la temperatura actual")
        var temperatura = readln().toInt()
        if(temperatura > max){
            max = temperatura
        }else if(temperatura > min){
            min = temperatura
        }
        println("Actualmente la temperatura máxima es $max y la mínima es $min")
    }
}