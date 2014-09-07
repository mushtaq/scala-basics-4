
object X {
  object Email {
    def apply(user: String, domain: String): String = s"$user@$domain"
    def unapply(str: String): Option[(String, String)] = str.split("@") match {
      case Array(user, domain) => Some(user, domain)
      case _                   => None
    }
  }

  val email = Email("mushtaq", "tw.com")

  def dd(email: String) = email match {
    case Email(user, "tw.com") => s"Hello $user"
    case Email(user, _) => s"Hello $user"
    case _              => "who are you?"
  }

  dd("asdasda")
  dd("asdasda@4444.com")



}

