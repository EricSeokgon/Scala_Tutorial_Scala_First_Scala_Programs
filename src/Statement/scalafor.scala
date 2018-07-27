package Statement

object scalafor {
  def main(args: Array[String]): Unit = {
    val books = List("Scala", "Groovy", "Java", "SQL", "CSS")
    for (book<-books)
      println(book)

  }

}
