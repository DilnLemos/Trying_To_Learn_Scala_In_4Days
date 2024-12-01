package taller

class Racional(x: Int, y: Int) {

  private def mcd(a: Int, b: Int): Int = {
    if (b == 0) a else mcd(b, a % b)
  }
  val numerador = x / mcd(x, y)
  val denominador = y / mcd(x, y)
  require(y > 0, "El denominador debe ser mayor a 0")

  def suma(r1: Racional): Racional = {
    /* CREA UN NUEVO RACIONAL CON "X" = A LA SUMA DE LAS MULTIPLICACIONES
    Y "Y" = A LA MULTIPLCIACIÓN DE DENOMINADORES COMO PARAMETROS */

    new Racional((numerador * r1.denominador) + (r1.denominador * denominador),
      r1.denominador * denominador)
  }

  def multiplicacion(r: Racional) = {

    new Racional(numerador * r.numerador, denominador * r.denominador)
  }

  override def toString = s"$numerador / $denominador"

  def MenorQue(r: Racional): Unit = {
    this.numerador * r.denominador < this.denominador * r.numerador
  }

  //def max(r: Racional): Unit = {
   // if (this.MenorQue(r) ) r else this
  //}
}

