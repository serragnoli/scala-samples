package sample

class IntPair(val x: Int, val y: Int) {
  private var fabs: Int = 0

  private def myTest: Int = 43
}

object IntPair {

  import math.Ordering

  implicit def ipord: Ordering[IntPair] = Ordering.by(ip => (ip.x, ip.y))
}
