fun main() {
    //Definicion de una lista inmmutable
    val listado = listOf(
    Student(name = "Ana", Nota = 50),
    Student(name = "Ariel", Nota = 100)
    )

    
    //Mutable
    val listado_mutable = mutableListOf(
        Student(name = "Ana", Nota = 50),
        Student(name = "Ariel", Nota = 100)
    )
    //Agregar
    listado_mutable.add(Student(name="Josefina",Nota = 80))

    //de Mutables Fin

    //Imprimir Valores con un Ciclo For
    for(item in listado)
    {
        println("Nombre: ${item.name} y nota es: ${item.Nota}")
    }

    //Suma de Notas
    val suma = listado.sumOf {x-> x.Nota}
    println("La suma de las notas es $suma")
}



data class Student(val name:String, val Nota:Int){

}
