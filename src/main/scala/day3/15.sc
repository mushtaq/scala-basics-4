

def divide10(n: Int) = n match {
  case 0    => 10
  case x    => 10 / n
}

val divide10a: Function1[Int, Int] = {
  case 0 => 10
  case x => 10 / x
}

val divide10b: PartialFunction[Int, Int] = {
  case x if x != 0 => 10 / x
}



divide10(2)
divide10(0)
divide10a(2)
divide10a(0)
divide10b.isDefinedAt(100)
divide10b.isDefinedAt(1)
divide10b.isDefinedAt(0)



