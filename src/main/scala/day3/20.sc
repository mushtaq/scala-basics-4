
val xs = List(2, 2, 4, 6, 1, 13, 18, 17, 1, 12)

xs.filter(_ > 10)
xs.filterNot(_ > 10)
val (less, more)  = xs.partition(_ > 10)


Seq(1, 2, 3, 4, 5).scanLeft(1)(_ + _)


xs.take(4)
xs.drop(4)
xs.splitAt(4)

xs.takeWhile(_ < 10)
xs.dropWhile(_ < 10)
xs.span(_ < 10)

val nums = 1 to 10
val chars = 'a' to 'z'

nums.zip(chars).toMap

1 +: 2 +: 3 +: Seq(4, 5, 6) :+ 7 :+ 8

1 :: 2 :: 3 :: Nil






