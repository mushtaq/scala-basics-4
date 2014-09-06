
trait Base { def print() = println("Base") }
class A extends Base  { override def print() = println("A") }
val a: Base = new A
a.print()
class B extends Base  { override def print() = println("B") }

trait X extends A

trait AA extends A

trait A {
  def n: Int
  def m = 10 + n
}

trait B {
  def n = 30
}

val ab: A with B = new A with B
val ab0: B with A = new A with B
val ab1: A = new A with B
val ab2: B = new A with B


ab.m
ab.n

