package sample

import java.util

import scala.collection.{SortedMap, mutable}

object MapTests extends App {
  val first = mutable.Map("Fabio" -> 38, "Karen" -> 37, "Isabella" -> 10)

  val result = first.get("Fabio")
  result match {
    case Some(t) => println(s"This is what I got $t")
    case None => println("Found nothing mate")
  }

  first("Fabio") = 39
  first("Sergio") = 62
  println(first("Sergio"))

  for ((k, v) <- first) println(s"Key: $k and Value: $v")
  for (k <- first.keySet) println(k)
  for (v <- first.values) println(v)

  val reversedFirst = for ((k, v) <- first) yield (v, k)
  println(reversedFirst)
  println(reversedFirst(62))

  var second = SortedMap("Karen" -> 37, "Isabella" -> 10, "Fabio" -> 38)
  println(second)
  second += "Zuleide" -> 49
  println(second)
  second += "Adrian" -> 38
  println(second)

  val javaMap: util.TreeMap[String, Int] = new java.util.TreeMap[String, Int]
  println(javaMap)

  val t = ("Fabio", "Serragnoli", 38, "London", "Brazil", "Pederneiras")
  println(s"Name: ${t._1}")
  println(s"Surname: ${t._2}")

  def whiteSpace: (Char) => Boolean = c => c == ' '
  println("New York City".partition(_.isUpper))

  val cities = Array("New York", "London", "Sao Paulo", "Florence", "Tokyo")
  val countries = Array("USA", "UK", "Brazil", "Italy", "Japan")
  println(cities zip countries toMap)
}