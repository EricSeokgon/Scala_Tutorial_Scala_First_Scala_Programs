package Introduction

object VariableDeclarations {
  def main(args: Array[String]): Unit = {
    var array: Array[String] = new Array(5)
    array = new Array(2)
    array(0) = "Hello"
    println(array )
  }

}
