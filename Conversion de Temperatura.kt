fun main() {
  println("Ingrese la temperatura en grados celsius: ")
    val cel = readLine()!!.toDouble()
    val farehrenheit = (cel * 9/5) + 32
    println("La temperatura de $cel °C equivale a $farehrenheit °F")


}
