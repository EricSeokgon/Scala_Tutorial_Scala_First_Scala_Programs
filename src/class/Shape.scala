package `class`

abstract class Shape {
  def area: Double = 0.0
  def draw(s:Shape)
}

abstract class Rectangle(val width: Double, val height: Double) extends Shape {
  override def area: Double = width * height
  val circle = draw(new Circle(3) {
    override def draw(s: Shape): Unit = ???
  })


}

abstract class Circle(val radius: Double) extends Shape {
  override def area: Double = math.Pi * radius * radius
  val rectangle = draw(new Rectangle(2,3) {
    override def draw(s: Shape): Unit = ???
  })
}

