package taller

class T1ListaFactoriales {
  val objFactorial = new T1Factorial()
  def T1ListaFactorial(n : Int): List[BigInt] = {
    if (n < 0) {throw new Exception("No se pueden hacer factoriales de numeros negativos")}
    else if (n == 0) List(1)
    else T1ListaFactorial(n - 1) :+ objFactorial.calculateFactorial(n)

  }
}
