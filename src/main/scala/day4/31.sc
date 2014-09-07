import day4.Monoid
import play.api.libs.json.Json

object X {
  trait Animal
  case class Lion(name: String) extends Animal
  case class Tiger(salary: Int) extends Animal
  object Animal {

//    implicit val l = new Monoid[Lion] {
//      def zero = Lion("zero")
//      def add(a: Lion, b: Lion) = Lion(a.name + b.name)
//    }
//
//    implicit val t = new Monoid[Tiger] {
//      def zero = Tiger(0)
//
//      def add(a: Tiger, b: Tiger) = Tiger(a.salary + b.salary)
//    }


  implicit val x = new Monoid[Animal] {
      def zero = Lion("zero")

      def add(a: Animal, b: Animal) = (a, b) match {
        case (Lion(n1), Lion(n2)) => Lion(n1 + n2)
        case (Lion(n), Tiger(s)) => Lion(n + s)
        case (Tiger(s), Lion(n)) => Tiger(s + n.length)
        case (Tiger(s1), Tiger(s2)) => Tiger(s1 + s2)
      }
    }
  }
  def sum[T](xs: T*)(implicit monoid: Monoid[T]): T =
    xs.foldLeft(monoid.zero)(monoid.add)
  sum(Lion("l1"), Tiger(10))


}

