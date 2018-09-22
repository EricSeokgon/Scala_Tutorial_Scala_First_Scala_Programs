package `class`

class sec01 {
  def myMethod(): String = "hadeslee.tistory.com"

  def myOtherMethod() = "Moof"

  def foo(a: Int): String = a.toString

  def f2(a: Int, b: Boolean): String = if (b) a.toString else "false"

  def list[T](p: T): List[T]
  = p :: Nil
  list(1)
  list("Hello")
}
