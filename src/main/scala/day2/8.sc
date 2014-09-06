
abstract class Direction(val name: String)
object East extends Direction("east")
object West extends Direction("west")

trait Person {
  def name: String

}

trait Employee extends Person
trait Employer extends Person

case class Manager(name: String) extends Employee
case class Dev(name: String) extends Employee

case class Owner(name: String) extends Employer
