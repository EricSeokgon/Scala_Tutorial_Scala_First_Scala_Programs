package `class`

object Main {
  def main(args: Array[String]) {
    class Book( val title:String)
    val book = new Book("Scala")

    println(book);
    println(book.title )
    //book.title = "new title"  //Error
  }
}