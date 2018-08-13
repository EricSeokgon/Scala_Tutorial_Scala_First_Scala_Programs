package Statement

import scala.util.Random

object ScalaPatternMatching extends App {
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

  val x: Int = Random.nextInt(10)

  x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  matchTest(3)  // many
  matchTest(1)  // one

  val anyList= List(1, "A", 2, 2.5, 'a')

  for (m <- anyList) {
    m match {
      case i: Int => println("Integer: " + i)
      case s: String => println("String: " + s)
      case f: Double => println("Double: " + f)
      case other => println("other: " + other)
    }
  }

}
