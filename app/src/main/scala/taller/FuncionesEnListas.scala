package taller

class FuncionesEnListas {

  // Map como EscalarLista para multiplicar todos los valores por factor
  def escalarlista(xs: List[Double], factor: Double): List[Double] = {
    xs match {
      case Nil => Nil
      case x :: xs => x*factor :: escalarlista(xs, factor)
    }
  }

  // map como elevar_al_cuadrado
  def elevar_al_cuadrado(xs: List[Double]): List[Double] = {

    xs match {
      case Nil => Nil
      case x :: xs => x * x :: elevar_al_cuadrado(xs)
    }
  }
  // Usando map para elevar al cuadrado

  def elevar_al_cuadrado_map(xs: List[Double]): List[Double] = {

    xs.map((x: Double) => x*x)
  }

  // FILTER
  def positivos_lista(xs: List[Double]): List[Double] = {

    xs filter (x => (x > 0))
  }


}
