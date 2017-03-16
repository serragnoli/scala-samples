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

class DefaultGreeter extends MyGreeter

class CustomisableGreeter(prefix: String, postfix: String) extends MyGreeter {
  override def greet(name: String): Unit = {
    println(s"$prefix $name$postfix")
  }
}
