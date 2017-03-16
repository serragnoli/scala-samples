package sample

object Methods extends App {
  def noParams(): Unit = println("No params")
  noParams()

  def add(x: Int, y: Int): Int = x + y
  println(add(6,9))

  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
  println(addThenMultiply(5,8)(3))
}
