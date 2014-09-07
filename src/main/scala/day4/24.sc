import scala.util.Try

Option(1).flatMap(x => Option.empty[Int].map(y => x + y))


val xs = for {
  x <- Option(1)
  if x == 1
  y <- Option(2)
  if y != 3
} yield x + y

Try(1)

Seq(1).map(_ + 10)
Seq(1).flatMap(x => Seq(x + 10))

Seq(1).filter(_ > 10)
Seq(1).flatMap(x => if(x > 10) Seq(x) else Seq.empty)

