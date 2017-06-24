package sample

object NothingTest extends App {
  def printAny(x: Any) {
    println(x)
  }

  def printUnit(x: Unit) {
    println(x)
  }

  printAny ("Hello") // Prints Hello
  printUnit("Hello")
}
