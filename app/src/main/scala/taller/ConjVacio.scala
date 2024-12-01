package taller

class ConjVacio extends ConjEnt {
  override def pertenece(x: Int): Boolean = false

  override def insertar(x: Int): ConjEnt = new ConjNoVacio(x, new ConjVacio, new ConjVacio)

}
