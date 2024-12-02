package taller

class OrdenamientoListas {

  def msort(xs: List[Int]): List[Int] = {

    def merge(l1: List[Int], l2: List[Int]): List[Int] = {
      l1 match {
        case Nil => l2
        case l :: ls => l2 match {
          case Nil => l1
          case ll :: lls => if (l < ll) l :: merge(ls, l2) else ll :: merge(l1, lls)
        }
      }
      val ll = xs.length / 2
      if (ll == 0) xs
      else {
        val (l1, l2) = xs splitAt ll
        merge(msort(l1), msort(l2))
      }
    }
  }
}
