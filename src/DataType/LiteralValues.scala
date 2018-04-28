package DataType

object LiteralValues {
  def main(args: Array[String]) {
    println(hello("This is a test"));

  }

  def hello(name: String) =
    s"""Welcome!
       Hello, $name!
       * (Star!!)
       |Hi.
       |    whitespace.""".stripMargin

}
