package taller

class ConjNoVacio(elem: Int, izq: ConjEnt, der: ConjEnt) extends ConjEnt {
  override def pertenece(x: Int): Boolean = {
    if (x < elem) izq pertenece(x)
    else if (x > elem) der pertenece(x)
    else true
  }

  override def insertar(x: Int): ConjEnt = {

    if (x < elem) new ConjNoVacio(elem, izq insertar(x), der)
    else if (x > elem) new ConjNoVacio(elem, izq, der insertar(x))
    else this
  }

}
