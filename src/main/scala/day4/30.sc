
import data._
import Data._
import day4.Implicits.RichT
books foreach println
Seq(2, 3, 4, 1).sorted
books.sortBy(b => (b.price, b.title.reveredOrder)) foreach println

