
case class Address(line1: String, pin: Int)
case class Person(name: String, address: Address) {
  def withPin(pin: Int) = copy(address = address.copy(pin = pin))
}

val p = Person("ashok", Address("chennai", 324))

p.withPin(100)


//
//p.address.line1
//p.name
//
//Person("samarth", p.address)
//
//p.copy(name = "abcd")

val a1 = Address("chennai", 324)
val a2 = Address("chennai", 324)

Address: (String, Int) => Address


a1 == a2
a1 eq a2

a1.hashCode()
a2.hashCode()


