package taller

class Racional(x: Int, y: Int) {

  def numerador = x
  def denominador = y

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
}

