import scala.collection.immutable.BitSet


Seq(1, 2, 3).map(_ + 1)
Set(1, 2, 3).map(_ + 1)

val xs = Map(1 -> "a", 2 -> "b")

xs.map{case (k, v) => k -> (v + 1)}
xs.map{case (k, v) => v -> k}
xs.map{case (k, v) => v}

BitSet(1, 2, 3).map(_.toString)

Seq(1) ++ Seq(3)




