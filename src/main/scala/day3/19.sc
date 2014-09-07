import data._
import Data._

books foreach println

books.groupBy(_.author).mapValues(_.map(_.price).sum) foreach println
books.groupBy(_.author).mapValues(_.foldLeft(0.0)(_ + _.price)) foreach println

books.sortBy(b => (b.price, b.title)) foreach println

books.sortWith(_.price < _.price) foreach println

val (importeds, locals) = books.partition(_.isImported)


//books.sorted(new Ordering[Book] {
//  def compare(x: Book, y: Book) = ???
//})


