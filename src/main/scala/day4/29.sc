import day4.Monoid
def sum[T](xs: T*)(implicit monoid: Monoid[T]): T =
  xs.foldLeft(monoid.zero)(monoid.add)


val local = new Monoid[Int] {
  def zero = 0
  def add(a: Int, b: Int) = a + b + 100
}

sum(1, 2, 3, 4)(local)
sum("a", "b")

sum(Option(1), Option(2), Option.empty[Int])
sum((1, "a"), (2, "b"))
sum((Option(1), Option("a")), (Option(2), Option.empty[String]))

