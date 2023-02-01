/*
class ConjuntoLibros(numMaxLibro:Int) {
    var libros = mutableListOf<Libro>()
    var maxLibros = 3
        get() {
            return field
        }
        set(value) {
            if(value<1){
                println("Error, no se puede tener menos de 1 libro")
            }else field = value
        }
    init {
        maxLibros = numMaxLibro
    }

    constructor(numMaxLibros: Int, libroInicial: Libro):this(numMaxLibros){
        libros.add(libroInicial)
    }
    constructor(numMaxLibros: Int, listaInicial: MutableList<Libro>):this(numMaxLibros){
        //libros = listaInicial
        for(libroActual in listaInicial){
            /*val nuevoLibro =  Libro(libroActual)
            libros.add(nuevoLibro)
            */
            libros.add(Libro(libroActual))
        }
    }
    fun anadir(libroInicial: Libro){
        if(libros.size < maxLibros){
            libros.add(libroInicial)
        }else println("No se puede añadir mas")
    }

/*
    override fun toString(): String {

    }

 */
     for borrarTitulo(titulo:string){
         for(libroActual in libros){

         }
     }

}

 */

/*
fun main(args: Array<String>) {
    val libro1 = Libro("Drácula", "Bram Stoker", 510, 10)
    val libro2 = Libro("Pepito Grillo", "Filomeno", 120, 15)
    println("Ingrese el título del libro: ")
    val libro3 = Libro("","",0,0)
    libro3.titulo = "El árbol de la ciencia"
    libro3.autor = "Pío Baroja"
    libro3.nPaginas = 290
    libro3.calificacion = 5
    val libro4 = Libro("","",0,0)
    libro4.titulo = "El libro gordo de Petete"
    libro4.autor = "Petete"
    libro4.nPaginas = 1500
    libro4.calificacion = 10
    val conjunto1 = ConjuntoLibros()
    conjunto1.libros.add(libro1)
    conjunto1.libros.add(libro2)
    conjunto1.libros.add(libro3)
    conjunto1.libros.add(libro4)
    conjunto1.mostrar()
}
 */