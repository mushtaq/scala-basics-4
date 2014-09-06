
class Person(var age: Int = 33) {

  val dd = "asdasd"

  def isWise = age > 21

  private[this] val x = 10

//  def compare(that: Person) = this.x == that.x

}

val p = new Person(90)

p.age
p.age = 55
p.age
p.isWise
