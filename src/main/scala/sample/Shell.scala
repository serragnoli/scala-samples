package sample

import scala.sys.process._

object Shell extends App {
//  "ls -al ..".!
  "ls -al ..".!!
}
