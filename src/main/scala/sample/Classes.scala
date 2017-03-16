package sample

object Classes extends App {
  new Greeter("Mr.").greet("Fabs")
}

object OtherClasses {
  def main(args: Array[String]): Unit ={
    val point = new PointOnMatrix(4,6)
    println(point)

    point.move(6,7)
    println(point)
  }
}

class Greeter(title: String) {
  def greet(name: String): Unit = {
    print(s"Hello $title $name")
  }
}

class PointOnMatrix(var x: Int, var y: Int) {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = s"($x,$y)"
}