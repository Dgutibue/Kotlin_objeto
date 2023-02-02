package Tiempo

class Hora(hora: Int, minuto: Int, segundo: Int) {
    var horas: Int = hora
        get() {
            return field
        }
        set(value) {
            if (value > 24){
                var resto = value%24
                field = value + resto
            }else field = value
        }
    var minutos: Int= minuto
        get() {
            return field
        }
        set(value) {
            if (value > 60){
                var resto = value/60
                field = value%60
                horas +=resto
            }else field = value
        }
    var segundos: Int= segundo
        get() {
            return field
        }
        set(value) {
            if (value > 60){
                var resto = value/60
                field = value%60
                minutos +=resto
            }else field = value
        }
    constructor():this(0,0,0)
    fun mostrar24(){
        if(this.horas > 23)
            this.horas = 0
        println("Son las $horas horas, $minutos minutos con $segundos segundos")
    }
    fun mostrar12(){
        when {
            this.horas == 0 -> {
                this.horas = 12
                println("Son las $horas horas, $minutos minutos con $segundos segundos de la noche")
            }
            this.horas in (21..23) -> println("Son las $horas horas, $minutos minutos con $segundos segundos de la noche")
            this.horas in (13..20) -> {
                this.horas -= 12
                println("Son las $horas horas, $minutos minutos con $segundos segundos de la tarde")
            }
            else -> println("Son las $horas horas, $minutos minutos con $segundos segundos de la mañana")
        }

    }
}