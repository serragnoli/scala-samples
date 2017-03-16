package sample

object Classes extends App {
  new Greeter("Mr.").greet("Fabs")
}

class Greeter(title: String) {
  def greet(name: String): Unit = {
    print(s"Hello $title $name")
  }
}