package sample

object Runnner extends App {
  println("First call: " + IdFactory.create())
  println("Second call: " + IdFactory.create())
}

object IdFactory {
  private var counter = 0

  def create(): Int = {
    counter += 1
    counter
  }
}
