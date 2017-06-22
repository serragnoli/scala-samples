package sample

class FunctionPassingAsArguments {

  val sayGoodMorning: (String) => String = (name: String) => s"Good Morning $name"

  val sayGoodAfternoon: (String) => String = (name: String) => s"Good Afternoon $name"

  def saySomething(whatToSay: String => String, name: String): Unit = println(whatToSay(name))
}

object FunctionPassingAsArgumentsRunner {
  def main(args: Array[String]): Unit = {
    val myGreeter = new FunctionPassingAsArguments()

    myGreeter.saySomething(myGreeter.sayGoodMorning, "Fabio")
  }
}
