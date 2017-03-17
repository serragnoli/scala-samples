package sample

class MixinClassComposition {

}

abstract class AbsIterators {
  type T

  def hasNext: Boolean

  def next: T
}

trait RichIterator extends AbsIterators {
  def foreach(f: T => Unit): Unit = {
    while (hasNext) f(next)
  }
}

class StringIterator(s: String) extends AbsIterators {
  type T = Char

  private var i = 0

  override def hasNext: Boolean = i < s.length

  def next: T = {
    val ch = s charAt i
    i += 1
    ch
  }
}