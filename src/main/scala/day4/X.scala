package day4

object X {

  implicit class RichT[T](val t: T) extends AnyVal {
    def hello = s"hello $t"
    def value = t
  }

  implicit class RichString(str: String) {
    def hello = s"hello $str"
    def hello1 = s"hello1 $str"
  }

  implicit class RichString2(str: String) {
    def hello = s"hello $str"
    def caps = str.capitalize
  }
}
