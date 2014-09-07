trait B { this: A =>
  def b = 90 + b1
}

trait A { this: B =>
  def m = 10
  def b1 = 10
  println(this.b)
  this.m + this.b
}

new A with B {}

