
import collection.JavaConverters._


val xs = (1 to 10).to[Vector]

xs.par.map(_ + 99)

val ys = new java.util.ArrayList[Int]

ys.add(10)
ys.add(100)
ys.add(1000)

val zs = ys.asScala

zs.asJava

val dd = collection.mutable.Seq(xs: _*)

xs
  .to[collection.mutable.Seq]
  .to[collection.immutable.Seq]










