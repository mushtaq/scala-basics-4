import java.io.File

def foreachLine[T](fileName: String)(f: String => T): Seq[T] = {
  val lines = io.Source.fromFile(fileName).getLines().toList
  val result = lines.map(line => f(line))
  result
}

val fileName = "/Users/mushtaq/projects/personal/workshops/scala-basics-4/src/main/scala/day1/3.sc"

val d = 10

val xs: Seq[Int] = foreachLine(fileName) { line =>
  line.split(" ")
  1 + d
}

