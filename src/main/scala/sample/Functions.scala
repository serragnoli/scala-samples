package sample

object Functions extends App {
  val noParam = () => 3
  println(noParam())

  val oneParam = (x: Int) => x + 1
  println(oneParam(4))

  val twoParams = (x: Int, y: Int) => x + y
  println(twoParams(3,4))
}
