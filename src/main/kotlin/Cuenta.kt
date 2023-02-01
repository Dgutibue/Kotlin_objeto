class Cuenta (numCuenta: String, saldo: Float) {
    var numCuenta = numCuenta
        set(value) {
            if(value.length != 10){
                println("Error, número de cuenta erróneo")
            }else field = value
        }
    var saldo = saldo
        set(value) {
            if(value < 0){
                println("Saldo en negativo")
            }
            field = value
        }
    var lista = mutableListOf<Cuenta>()
    init{
        this.numCuenta = numCuenta
        if(saldo < 0){
            println("No se puede abrir una cuenta en negativo")
        }
    }

    constructor(otraCuenta: Cuenta):this(otraCuenta.numCuenta, otraCuenta.saldo){
        lista.add(otraCuenta)
    }
    fun transferencia(cuentaDestino: Cuenta, cantidad: Float){
        if (saldo - cantidad < 0){
            println("No se puede realizar la operación, saldo insuficiente")
        }else {
            cuentaDestino.saldo += cantidad
            saldo += cantidad
        }

    }
    fun retirar(cantidad: Float){
        saldo -= cantidad
        if (saldo - cantidad < 0){
            println("Se ha quedado en números rojos con una cantidad de $saldo")
        }
    }
    fun ingresar(cantidad: Float){
        saldo += cantidad
    }
}