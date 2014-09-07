
Seq(1).map(_ + 10)
Seq.empty[Int].map(_ + 10)

Option(1).map(_ + 10)
Option.empty[Int].map(_ + 10)

Option(1).filter(_ > 0)
Option(1).filter(_ > 10)

Option(1).flatMap(x => Option.empty[Int].map(y => x + y))


Option(1) == Option(1)

Option(1).exists(_ == 1)
Option.empty[Int].exists(_ == 1)

Option(1).forall(_ == 1)
Option.empty[Int].forall(_ == 1)

Seq(1) ++ Seq(2)

def concat(s1: Option[String], s2: Option[String]) = s1 ++ s2 mkString ""

concat(Option("e"), Option("r"))
concat(Option("e"), None)
concat(None, None)



