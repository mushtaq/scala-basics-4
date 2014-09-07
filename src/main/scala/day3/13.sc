
val xs = Seq(1, 2, 3, 4)

xs.map(_ + 1)

xs.map(x => x + 1)

xs.map {
  case x if x > 2 => x + 1
  case x          => x
}
