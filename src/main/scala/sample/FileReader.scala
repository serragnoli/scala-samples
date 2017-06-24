package sample

import java.io.PrintWriter

import scala.io.Source

object FileReader extends App {
  val t = Source.fromFile("/Users/fse05/Development/Learning/scala-samples/src/main/scala/sample/myFile.txt", "UTF-8")
  println(t.mkString)

  val t1 = Source.fromURL("https://dzone.com/articles/fully-automated-app-monitoring")
  println(t1.mkString)
}

object FileWriter extends App {
  val out = new PrintWriter("fabs_numbers.txt")
  for (i <- 1 to 100)
    out.println(i)
  out.close()
}
