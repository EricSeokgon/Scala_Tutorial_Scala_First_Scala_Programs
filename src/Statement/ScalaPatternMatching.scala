package Statement

object ScalaPatternMatching extends App{
  def printNum(int: Int) {
    int match {
      case 0 => println("Zero")
      case 1 => println("One")
      case _ => println("more than one")
    }
  }
  printNum(0)
  printNum(1)
  printNum(2)

  def fibonacci(in: Int): Int = in match {
    case 0 => 0
    case 1 => 1
    case n => fibonacci(n - 1) + fibonacci(n - 2)
  }

}
