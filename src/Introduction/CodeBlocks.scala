package Introduction

object CodeBlocks {

  def meth1(): String = {
    "hi"
  }

  def meth2(): String = {
    val d = new java.util.Date()
    d.toString()
  }

  def main(args: Array[String]) {
    println(meth1)
    println(meth2)
  }
  val x3:String= {
    val d = new java.util.Date()
    d.toString()
  }
}
