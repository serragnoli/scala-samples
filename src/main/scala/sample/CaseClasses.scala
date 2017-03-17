package sample

object CaseClasses extends App {
  val point = Point(1, 3)
  val anotherPoint = Point(1, 3)
  val yetAnotherPoint = Point(3, 3)

  if (point == anotherPoint) println("Point and Another points equal") else println("Point and Another different")
  if (point == yetAnotherPoint) println("Point and Yet points equal") else println("Point and Yet different")
}

case class Point(x: Int, y: Int)

abstract class Notification

case class Email(sourceEmail: String, title: String, body: String) extends Notification

case class Sms(sourceNumber: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification

object NotificationRunner {
  def main(args: Array[String]): Unit = {
    val hereEmail = Email("here@not-there.com", "Funny", "This is important")
    println(hereEmail.title)

    val newEmail = hereEmail.copy(title = "Not so funny")
    println(newEmail.title)

    val first = Sms("12345", "Hi")
    val second = Sms("12345", "Hi")
    println(first == second)

    val third = Sms("12345", "Hello")
    println(second == third)

    println(showNotification(third))
  }

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        s"Email: $notification"
      case Sms(sourceNumber, message) =>
        s"SMS: $notification"
      case VoiceRecording(contactName, link) =>
        s"Voice: $notification"
    }
  }
}