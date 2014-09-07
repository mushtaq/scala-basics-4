class A {
  def inner = 99
}

case class Person(name: String, age: Int)

val Dd = "ashok"

def m(a: Any) = a match {
  case 1                     => 1
  case "A" | "B"             => 2
  case "abc"                 => 3
  case x@"xyz"               => s"Hello: ${x.length}"
  case x: A if x.inner > 100 => x.inner
  case x: A                  => 88
  case Dd                    => "hello"
  case Person("mushtaq", age)  => age
  case Seq(x, y, 35)             => 22
  case Seq(x, ys @ _*)             => 22
  case x +: ys             => 22
  case Person(n, age)          => age + n.length
  case x                     => 77
}

m("ashok123123123")
m("ashok")
m(1)
m("abc")
m(1876)
m(new A)
m("xyz")
