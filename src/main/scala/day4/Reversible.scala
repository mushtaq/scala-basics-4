package day4

case class Reversible[T](value: T)

object Reversible {
  implicit def x[T: Ordering]: Ordering[Reversible[T]] =
    Ordering[T].reverse.on[Reversible[T]](_.value)
}


object Implicits {
  implicit class RichT[T](t: T) {
    def reveredOrder = Reversible[T](t)
  }
}

