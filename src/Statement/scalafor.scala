package Statement

object scalafor {
  def main(args: Array[String]): Unit = {
    val dogBreeds = List("A", "B", "C", "D", "E", "F")

    for (breed <- dogBreeds)
      println(breed)

  }

}
