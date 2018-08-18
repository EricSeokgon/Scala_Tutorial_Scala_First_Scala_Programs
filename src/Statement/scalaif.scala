package Statement

object scalaif {

  val exp: Boolean = true

  def main(args: Array[String]): Unit = {
    if (exp) println("yes")

    if (exp) {
      println("Line one")
      println("Line two")
    }

    //val i: Int = if (exp) 1 else 3

    val i: Int = if (exp)
      1
    else {
      val j = System.currentTimeMillis
      (j % 100L).toInt
    }

  }

}
