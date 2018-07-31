package Statement

object whileLoops {
  def main(args: Array[String]): Unit = {
    var count = 0

    do {
      count += 1
      println(count)
    } while (count < 10)
  }

}
