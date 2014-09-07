import scala.util.Try

try
  1 / 0
catch {
  case ex: ArithmeticException => 0
  case ex: ArithmeticException => 0
  case ex: ArithmeticException => 0
  case ex: ArithmeticException => 0
  case ex: ArithmeticException => 0
} finally {

}

Try(10/2).recover {
  case ex: _ => 0
}
Try(10/0).recover {
  case ex: ArithmeticException => 0
}
Try(10/0).recoverWith {
  case ex: ArithmeticException => Try(5/0)
}

Try(10/2).getOrElse(77)
Try(10/2).orElse(Try(77/0))


Option(10).getOrElse(0)
Option.empty[Int].getOrElse(0)

Option(10).orElse(Option(11))
Option.empty[Int].orElse(Option(11))

