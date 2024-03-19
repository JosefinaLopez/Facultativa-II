
fun main() {
  println("Ingrese una frase:")
    val frase = readLine()!!
    val palabras = frase.split(" ").count()
    println("El numero de palabras en la frase  es $palabras")
}
