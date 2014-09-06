


class A {
  def inner = 99
}

val Dd = "ashok"

def m(a: Any) = a match {
  case 1                     => 1
  case "abc"                 => 3
  case x@"xyz"               => s"Hello: ${x.length}"
  case x: A if x.inner > 100 => x.inner
  case x: A                  => 88
  case Dd                    => "hello"
  case x                     => 77

}

m("ashok123123123")
m("ashok")
m(1)
m("abc")
m(1876)
m(new A)
m("xyz")
