class Libro(titulo: String, autor: String, nPaginas: Int, calificacion: Int) {
    var titulo = titulo
    var autor = autor
    var nPaginas = 0
        set(value) {
            if(value > 0){
                field = value
            }else println("El libro debe de tener algunas páginas")
        }
    var calificacion: Int = 0
        set(value) {
            if(value in (0..10)){
                field = value
            }else println("ERROR. La calificación debe ser entre 0 y 10")
        }
        get(){
            return field
        }
    init {
        this.nPaginas = nPaginas
        this.calificacion = calificacion
    }
    constructor(otroLibro:Libro):this(otroLibro.titulo,otroLibro.autor,otroLibro.nPaginas,otroLibro.calificacion){

    }
}