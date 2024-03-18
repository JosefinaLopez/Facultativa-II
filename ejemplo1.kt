fun main() {
  val name = "Ariel"
  val age = 25
  val alumn = Student(name = name, carnet = "20043001", nota = 100)
  val alumn2 = Student(nota = 85, carnet = "204350", name = "Carmen")
  println(alumn2)
  println(alumn)

  greeting(name)
  println(greeting2(name = name))
}
fun greeting(name:String=""){
    println("Hola $name")
}
fun greeting2(name:String):String{
    return "Bienvenido $name"
}

//Clase
//VAL = Mtable  VAR = INMMUTABLE
data class Student(val name: String,  val carnet:String, val nota:Int)
{

}
