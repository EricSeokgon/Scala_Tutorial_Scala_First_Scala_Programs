package Statement

object Scalatryexpressions {


  def newException(str: String): Throwable = ???

  def main(args: Array[String]): Unit = {


    try {
      throw newException("some exception...")
    } finally{
      println("This will always be printed")
    }

  }

}
