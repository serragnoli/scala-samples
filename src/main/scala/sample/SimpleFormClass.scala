package sample

import scala.beans.BeanProperty

class SimpleFormClass {
  private[this] var privateAge = 10

  def age: Int = privateAge

  def age_=(newAge: Int): Unit = {
    if (newAge > privateAge) privateAge = newAge
  }
}

class MostRestrictiveVisibility {
//  private[this] var stage = 10
  private var stage = 10

  def increment(): Unit = {
    stage += 1
  }

  def isLess(other: MostRestrictiveVisibility): Boolean = {
    stage < other.stage
  }
}

object MostRestrictiveVisibilityTest extends App {
  val t1 = new MostRestrictiveVisibility()
  val t2 = new MostRestrictiveVisibility()

  t2.increment()

  println(t1.isLess(t2))
}

class ClassWithJavaGetterAndSetter {
  @BeanProperty var myAge = 0
}

class ClassWithGettersAndSettersInConstructorParameter(val myAge: Int)


class WithMultipleConstructors {
  var name: String = "Fabio"

  def this(name: String) {
    this()
    this.name = name
  }
}

object WithMultipleConstructorsTest extends App {
  val t1 = new WithMultipleConstructors()
  val t2 = new WithMultipleConstructors("Karen")

  println(t1.name)
  println(t2.name)
}
