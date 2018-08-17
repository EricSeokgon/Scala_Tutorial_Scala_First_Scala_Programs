package Statement

class ScalaMatchExpressions {
  def main(args: Array[String]): Unit = {
    44 match {
      case 44 => true// if we match 44,the result is true
      case _ => false// otherwise the result isfalse
    }

    "CSS" match {
      case "CSS"=> 45 // the result is 45 if we match "CSS"
      case "Elwood" => 77
      case _ => 0
    }
  }

}
