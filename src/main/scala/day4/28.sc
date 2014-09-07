import day4.Monoid
def sum[T](xs: T*)(monoid: Monoid[T]): T =
  xs.foldLeft(monoid.zero)(monoid.add)

sum(1, 2, 3, 4)(Monoid.intM)
sum("a", "b")(Monoid.strM)
sum(Option(1), Option(2), Option.empty[Int])(
  Monoid.optionM(Monoid.intM)
)
sum((1, "a"), (2, "b"))(
  Monoid.tupleM(Monoid.intM, Monoid.strM)
)

sum((Option(1), Option("a")), (Option(2), Option.empty[String]))(
  Monoid.tupleM(Monoid.optionM(Monoid.intM), Monoid.optionM(Monoid.strM))
)

