
def concat(s1: String, s2: String): String =
  if(s1 == null) s2
  else if(s2 == null) s1
  else s1 + s2

concat("null", "abcd")


def concat2(s1: Option[String], s2: Option[String]): Option[String] =
  if(s1 == None) s2
  else if(s2 == None) s1
  else Some(s1.get + s2.get)

concat2(None, None)

def concat3(s1: Option[String], s2: Option[String]): Option[String] = (s1, s2) match {
  case (None, _)            => s2
  case (_, None)            => s1
  case (Some(v1), Some(v2)) => Some(v1 + v2)
}

def concat4(s1: String, s2: String): String = (s1, s2) match {
  case (null, _)            => s2
  case (_, null)            => s1
  case (v1, v2)             => v1 + v2
}

concat3(Some("a"), Some("b"))
