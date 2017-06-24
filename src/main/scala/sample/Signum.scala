package sample

object Signum {
  def apply: Signum = new Signum()
}

class Signum {

  def signumOf(number: Int): Int = {
    number match {
      case x: Int if x > 0 => 1
      case x: Int if x < 0 => -1
      case _ => 0
    }
  }

  def t1(): Unit = {}

  def test(): Unit = {
    var x: Any = 0
    var y: Int = 0

    x = y = 1

    println(s"X =$x, Y=$y")
  }


  def loopEquivalent(): Unit = {
    for (i <- 10 to 1 by -1) {
      println(i)
    }
  }

  def countDown(from: Int): Unit = {
    for (i <- from to 0 by -1) {
      println(i)
    }
  }

  def productOfUnicode: BigInt = {
    "Hello".map(BigInt(_)).product
  }

  def productOfUnicodeRec(word: String): BigInt = {
    if (word.length == 0) return 1
    val result = BigInt(word.head) * productOfUnicodeRec(word.tail)
    result
  }

  def testLoop(): Unit = {
    for (i <- 1 to 10 reverse) println(s"Yeah $i")
  }

  def testForComprehension(): Unit = {
    val result = for (e <- 1 to 10) yield e * 2

    println(result)
  }

  def testForComprehensionSecondStyle(): Unit = {
    val result = for (e <- 1 to 10 if e % 2 == 0) yield e * 2

    println(result)
  }

  def testForComprehensionThirdStyle(): Unit = {
    val result = (1 to 10).filter(_ % 2 == 0).map(_ * 2)

    println(result)
  }

  def testForComprehensionThatRemovesNegativesFromArray(): Unit = {
    val result = for (e <- -10 to 10 if e >= 0) yield 2 * e

    println(result)
  }

  def sortWithTest: IndexedSeq[Int] = {
    (1 to 30).sortWith(_ > _)
  }

  def createTuple: (String, String, Int) = {
    ("Fabio", "Serragnoli", 38)
  }
}

object TestSignum {
  def main(args: Array[String]): Unit = {
    val s = Signum.apply
    //    println(s"Should be 1 => ${s.signumOf(12)}")
    //    println(s"Should be -1 => ${s.signumOf(-21)}")
    //    println(s"Should be 0 => ${s.signumOf(0)}")
    //    s.test()
    //    s.loopEquivalent()
    //    s.countDown(32)
    //    println(s.productOfUnicodeRec("Hello"))
    println(s.sortWithTest)
    s.testForComprehension()
    s.testForComprehensionSecondStyle()
    s.testForComprehensionThirdStyle()
    s.testForComprehensionThatRemovesNegativesFromArray()
    println(s"Sum range ${(1 to 10).sorted}")
    println(s"Sum Array ${Array(1 to 10: _*).sorted.mkString(">>>>>", "::", "<<<<<")}")
    println("Fabio " * 5)
    print(s.createTuple)
  }
}

