package `class`

class Shape {
  def area: Double = 0.0

}

class Rectangle(val width: Double, val height: Double) extends Shape {
  override def area: Double = width * height
}

class Circle(val radius: Double) extends Shape {
  override def area: Double = math.Pi * radius * radius
}