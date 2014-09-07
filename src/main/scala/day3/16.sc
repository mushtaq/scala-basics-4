

val pf1: PartialFunction[Int, String] = {
  case x if x > 10 => "greater than 10"
}

val pf2: PartialFunction[Int, String] = {
  case x if x < 0 => "less than 0"
}

val pf3: PartialFunction[Int, String] = {
  case 5 => "i am 5"
}

val pf = pf1.orElse(pf2).orElse(pf3)

val f = pf.lift

pf.isDefinedAt(5)
pf.isDefinedAt(5)
pf.isDefinedAt(11)

f(99)
f(5)
f(4)
