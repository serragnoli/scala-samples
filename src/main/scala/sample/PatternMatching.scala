package sample

object PatternMatching extends App {
  def matchTest(x: Int): String = x match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "Many"
  }

  println(matchTest(1))
  println(matchTest(3))
}

object PatternMatching2 extends App {
  def matchTest(x: Any): Any = x match {
    case 1 => "One"
    case "Two" => 2
    case y: Int => "scala.Int"
  }

  println(matchTest(1))
  println(matchTest("Two"))
  println(matchTest(3))
}
