
class Person(age: Int, isFemale: Boolean) {
  def isWise = if(isFemale) age > 18 else age > 21
  def canMarry(canDrink: Int => Boolean) = isWise && canDrink(age)
}

val p = new Person(23, true)

p.canMarry(age => age > 26)

def delhiCanDrink(age: Int) = age > 40

val bloreCanDrink: Int => Boolean = { age: Int =>
  age > 5
}

val dd = delhiCanDrink _


delhiCanDrink(30)
bloreCanDrink(30)

p.canMarry(bloreCanDrink)
p.canMarry(delhiCanDrink)

















