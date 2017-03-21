package sample

import java.util.Locale

object SequenceComprehensions extends App {
  def even(from: Int, to: Int): List[Int] = {
    for {
      i <- List.range(from, to).filter(x => x % 2 == 0)
    } yield i
  }

  println(even(0, 30))
}

object UpperCaser extends App {
  def toUpperCase(lowerCaseSeq: Array[String]): Array[String] = {
    for {
      t <- lowerCaseSeq
    } yield t.toUpperCase(new Locale("tr"))
  }

  println(toUpperCase(Array[String]("test", "if", "this", "text", "can", "be", "capitalised")).mkString(", "))
}