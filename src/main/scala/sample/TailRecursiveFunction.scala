package sample

class TailRecursiveFunction {

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a == 0) acc
      else loop(a - 1, acc)
    }

    loop(5, 0)
  }
}
