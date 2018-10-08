package `class`

class sec06 {
  val add = (x: Int, y: Int) => x + y
  add(3,3)

  def add(x: Int)(y: Int) = x + y

  def add(x: Int) = (y: Int) => x + y

  def curriedAdd(a: Int)(b: Int) = a + b
  curriedAdd(2)(2)
}
