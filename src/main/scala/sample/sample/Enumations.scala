package sample.sample

object TrafficLightColour extends Enumeration {
  type TrafficLightColour = Value

  val Red, Yellow, Green = Value
}

class TrafficLights {

  import TrafficLightColour._

  var currentColour = TrafficLightColour.Red

  def changeTo(colour: TrafficLightColour): Unit = {
    currentColour = colour
  }

  def letCarsPass(): Unit = {
    currentColour = TrafficLightColour.Green
  }

  def stopAll(): Unit = {
    currentColour = TrafficLightColour.Red
  }
}

object RunTrafficLights extends App {
  val t = new TrafficLights

  t.letCarsPass()
  println(t.currentColour)
  t.stopAll()
  println(t.currentColour)
  t.changeTo(TrafficLightColour.withName("Yellow"))
  println(t.currentColour)
}