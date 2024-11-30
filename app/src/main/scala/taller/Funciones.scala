package taller

class Funciones {

  def size = 2
  def square(x: Int): Int = x*x
  def SumOfSquares(x: Int, y: Int): Double = square(x) + square(y)
//---------------------------------------------------------------------------------

  def recursividad_Factorial(n: Int): Int = {
    if (n == 0) {1}
    else n * recursividad_Factorial(n-1)
  }

  def recursividad_factorial_lineal(cont: Int, resultado: Int, n: Int): Int = {

    if (cont > n) {resultado}
    else recursividad_factorial_lineal(cont + 1, resultado * cont, n)

  }
}
