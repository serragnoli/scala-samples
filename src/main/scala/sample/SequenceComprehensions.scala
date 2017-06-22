package sample

import java.util.Locale

import scala.collection.immutable.IndexedSeq

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

object ComputePairs extends App {
  def pairs(n: Int, v: Int): IndexedSeq[(Int, Int)] = {
    for (i <- 0 until n;
         j <- i until n if i + j == v
    ) yield (i, j)
  }

  pairs(20, 32) foreach {
    case (x, y) => println(s"($x,$y)")
  }
}