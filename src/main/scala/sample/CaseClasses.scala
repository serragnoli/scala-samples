package sample

object CaseClasses extends App {
  val point = Point(1, 3)
  val anotherPoint = Point(1, 3)
  val yetAnotherPoint = Point(3, 3)

  if(point == anotherPoint) println("Point and Another points equal") else println("Point and Another different")
  if(point == yetAnotherPoint) println("Point and Yet points equal") else println("Point and Yet different")
}

case class Point(x: Int, y: Int)