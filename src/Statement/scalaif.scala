package Statement

object scalaif {

  val exp: Boolean = true

  def main(args: Array[String]): Unit = {
    if (exp) println("yes")

    if (exp) {
      println("Line one")
      println("Line two")
    }

  }

}
