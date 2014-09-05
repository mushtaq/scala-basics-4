import scala.annotation.tailrec
import scala.collection.mutable

def map(xs: Seq[Int], f: Int => Int): Seq[Int] = {
  val it = xs.iterator
  val result = mutable.Buffer.empty[Int]
  while (it.hasNext) {
    result += f(it.next())
  }
  result.toList
}

def map2(xs: Seq[Int], f: Int => Int): Seq[Int] = {
  val it = xs.iterator
  var result = Seq.empty[Int]
  while (it.hasNext) {
    result = result :+ f(it.next())
  }
  result
}

def map3(xs: Seq[Int], f: Int => Int): Seq[Int] = {
  loop(xs, Seq.empty, f)
}

def loop(remaining: Seq[Int], acc: Seq[Int], f: Int => Int): Seq[Int] = {
  if(remaining.isEmpty)
    acc
  else
    loop(remaining.tail,  acc :+ f(remaining.head), f)
}


val ys = map3(1 to 100000, x => x * x)





