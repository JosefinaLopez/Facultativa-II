fun generarContrasenia(logintud:Int):String{
  //secuencia a..z que incluye todos los caracteres o numeros del abecedario
  val caracteres = ('A'..'Z') + ('a'..'z') +('0'.. '9')
  return (1..logintud)
          //map itera sobre todos los caracteres y selecciona uno random
    .map { caracteres.random() }
    //convierte caracteres en cadena separandolo por comas xd
    .joinToString()
}
fun main() {
  println("Ingrese la logitud de la contraseña:")
    val logitud = readLine()!!.toInt()
    val contrasenia = generarContrasenia(logitud)
    println("La contraseña generada es $contrasenia")
}
