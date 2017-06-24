package sample

import scala.io.StdIn

class MyIfStatement {

  var flag = false

  def myTest(): Unit = {
    val name = "Fabio"
    val age = 1

    println("Fabs I")
    print(f"\nHello, $name! In six months, you'll be ${age + 0.5}%17.2f years old.\n")
    println("Fabs II")

  }

  //This is a procedure (not '=' and no return value)
  def inputReader() {
    val colour: String = StdIn.readLine("Your colour please: ")
    val age = StdIn.readDouble()

    print(f"Your favourite colour is $colour and you are $age%3.4f years old")
  }

  def sumAll(args: Int*): Int = {
    var result = 0

    for (arg <- args) result += arg

    result
  }

  def sumAllRec(args: Int*): Int = {
    val result = if (args.isEmpty) 0 else args.head + sumAllRec(args.tail: _*)

    result
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    println(new MyIfStatement().sumAllRec(1 to 2: _*))
  }
}
