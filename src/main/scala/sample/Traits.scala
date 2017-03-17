package sample

object Runner extends App {
  val greeter = new DefaultGreeter
  greeter.greet("Fabio")

  val custGreeter = new CustomisableGreeter("How are you,", "?")
  custGreeter.greet("Fabs")
}

trait MyGreeter {
  def greet(name: String): Unit = println(s"Hello $name. How are you today?")
}

trait Similarity {
  def isSimiliar(x: Any): Boolean

  def isNotSimilar(x: Any): Boolean = !isSimiliar(x)
}

class DefaultGreeter extends MyGreeter

class CustomisableGreeter(prefix: String, postfix: String) extends MyGreeter {
  override def greet(name: String): Unit = {
    println(s"$prefix $name$postfix")
  }
}

//class MyPoint(x: Int, y: Int) extends Similarity {
//}
