

val strings = Seq("a", "b")
strings: Seq[String]
strings: Function1[Int, String]

val xs = strings

xs(1)

Set("a", "b"): String => Boolean

Map(1 -> "a", 2 -> "b"): Int => String

Seq(1, 2)
Map(1 -> "a", 2 -> "b")

Seq(1, 2).map(x => Map(1 -> "a", 2 -> "b")(x))






