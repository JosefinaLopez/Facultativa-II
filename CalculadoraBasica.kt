fun main() {
  println("Ingrese el primer numero: ")
    val num1 = readLine()!!.toDouble()
  println("Ingrese el segundo numero: ")
    val num2 = readLine()!!.toDouble()
  println("Seleccione una opcion: \n1. Suma\n2. Resta\n3.Multiplicacion\n4.Division")
    val opcion = readLine()!!.toInt()

    val resultado = when (opcion)
    {
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> num1 * num2
        4 -> {
            if(num2 != 0.0) num1 / num2 else "Error: No se puede dividir entre cero"
        }
        else -> "Operacion Invalida"
    }
    println("El Resultado es $resultado")
}
