
val x: String = "abc"

val y: String = "abc"

x: String
x: x.type


object A extends Object {
  def m = 99

}
lazy val B = new Object

A: Object


object D {
  class X private (age: Int) {
    private val dd = 100
    X.ee
  }

  object X {
    private val ee = "asasd"
    def make = new X(99).dd
  }
}
