
val xs = (1 to 5).toList
val ys = ('a' to 'c').toList


xs.flatMap(x => ys.map(y => (x, y))) foreach println

xs
  .filter(_ > 2)
  .flatMap { x =>
    ys
      .filter(_ != 'c')
      .map { y =>
        (x, y)
      }
} foreach println


val dd = for {
  x <- xs
  if x > 2
  y <- ys
  if y != 'c'
} yield {
  1
  2
  3

  (x, y)
}

//dd foreach println

xs
  .filter(_ > 2)
  .foreach{ x =>
  ys
    .filter(_ != 'c')
    .foreach { y =>
    (x, y)
  }
}

xs.zipWithIndex.map { case (e, i) =>

}