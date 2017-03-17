package sample

object Functions extends App {
  val noParam = () => 3
  println(noParam())

  val oneParam = (x: Int) => x + 1
  println(oneParam(4))

  val twoParams = (x: Int, y: Int) => x + y
  println(twoParams(3, 4))
}

object AnonymousFunction {
  val plusOne = (x: Int) => x + 1

  def main(args: Array[String]): Unit = {
    println(plusOne(2))
  }
}

object HighOrderFunctions {
  def main(args: Array[String]) = {
    println("Plus " + hof(12, plusOne))
    println("Minus " + hof(12, minusOne))
  }

  val plusOne = (x: Int) => x + 1
  val minusOne = (x: Int) => x - 1
  val hof = (x: Int, f: Int => Int) => f(x)
}