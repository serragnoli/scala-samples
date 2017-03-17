package sample

object Currying {
  def main(args: Array[String]): Unit = {
    val withFirst = sumNumbers(3)_

    // Computation to get the next number

    println(withFirst(4))
  }


  def sumNumbers(first: Int)(second: Int): Int = {
    first + second
  }
}


