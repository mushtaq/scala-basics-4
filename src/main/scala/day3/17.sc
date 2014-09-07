import data._
import Data._

books foreach println
books.filter(_.author == "odersky") foreach println
books.map(_.price) foreach println

books.filter(_.author == "odersky").map(_.price)

books.collect {
  case Book("odersky", _, price, _) => price
}

val pf: PartialFunction[Book, Double] = {
  case Book("odersky", _, price, _) => price
}

books.filter(pf.isDefinedAt) foreach println

books.filter(pf.isDefinedAt).map(pf)
books.filter(b => pf.isDefinedAt(b)).map(b => pf(b))

