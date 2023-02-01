class Cliente(DNI: String, cuentas: MutableList<Cuenta>) {
    var DNI: String= DNI
        set(value) {
            if(value.length != 9){
                println("DNI incorrecto.")
            }else field = value
        }
    var cuentas = mutableListOf<Cuenta>()
        set(value) {
            if(value.size <= 3){
                field = value

            }else println("No se puede tener más cuentas")
        }
        get() {
            return field
        }
    init{
        for (i in 0..10){
            for(n in 0..10){
                if(i == 0 || i == 10) {
                    print("*")
                }else print(" ")
            }
            println()
        }
/*
        if(cuentas.size <= 3){
            this.cuentas = cuentas
        }else{
            this.cuentas = cuentas.subList(0,2)
        }

 */
    }




    fun moroso(){
        for(i in cuentas){
            if(i.saldo < 0){
                println("Tienes en la cuenta con número ${i.numCuenta} un saldo negativo de ${i.saldo}")
            }
        }
    }
    fun mostrar(){
        println("Cliente con DNI: $DNI")
        for(i in cuentas){
            println("Número de cuenta: ${i.numCuenta} saldo: ${i.saldo} ")
        }
    }
}

/*
fun main(args: Array<String>) {
    val cliente = Cliente("73845234R",3)
    val cuenta1 = Cuenta("2349520472", 0f)
    val cuenta2 = Cuenta("1234464275", 700f)
    val cuenta3 = Cuenta("3924502384", 123f)
    cliente.anadir(cuenta1)
    cliente.anadir(cuenta2)
    cuenta1.ingresar(1100f)
    cuenta2.retirar(750f)
    cliente.mostrar()
    cuenta1.transferencia(cuenta2,600f)
    cliente.mostrar()

fun anadir(numCuenta: Cuenta){
        when{
            cuentas.size < numeroMax && numCuenta.saldo >= 0 -> cuentas.add(numCuenta)
            numCuenta.saldo < 0 -> println("No se puede abrir la cuenta en negativo")
            cuentas.size > numeroMax -> println("No puede tener más cuentas.")
        }
    }

 */
/*
fun main(args: Array<String>) {
    val cuenta1 = Cuenta("2349520472", 0f)
    var listaCuenta = mutableListOf<Cuenta>()
    listaCuenta.add(cuenta1)
    listaCuenta.add(Cuenta("1234464275", 700f))
    listaCuenta.add(Cuenta("3924502384", 123f))
    val cliente = Cliente("73845234R",listaCuenta)

    cliente.mostrar()

}
 */