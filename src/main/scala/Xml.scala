object XmlTest1 extends App {
  val page =
    <html>
      <head>
        <title>Hello XHTML world</title>
      </head>
      <body>
        <h1>Hello world</h1>
        <p>
          <a href="scala-lang.org">Scala</a>
          talks XHTML</p>
      </body>
    </html>;
  println(page.toString())
}

object XmlTest2 extends App {

  val df = java.text.DateFormat.getInstance()
  val dateString = df.format(new java.util.Date())

  def theDate(name: String) =
    <dateMsg addressedTo={name}>
      Hello, {name}! Today is {dateString}
    </dateMsg>;
  println(theDate("John Doe").toString())
}
