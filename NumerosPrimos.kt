fun main() {
  println("Ingrese el numero para verificar si es primo: ")
    val num = readLine()!!.toDouble()

}
fun esPrimo(numero:Int):Boolean{
    if(numero <= 1)
    {
        return false
    }
    //until delimita el ciclo para que no sobrepase al numero ingresado
    //va de 2 a numero ingresado -1
    for (i in 2 until numero){
        //Compara si el residuo es 0
        if (numero %i == 0)
        {
            return false
        }
    }
    return true
}