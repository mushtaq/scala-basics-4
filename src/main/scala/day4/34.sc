

val ns = Stream.from(1)

val ms = ns.map(x => x * x)

ns
ms
ms.take(10).toList
ns
ms



val xs = Stream
  .from(1)
  .map(x => x * x)
  .filter(_ % 2 == 0)
  .drop(10)


(xs take 3).toList

def fib(a: Int, b: Int): Stream[Int] = a #:: fib(b, a + b)

fib(1, 1) take 10 toList

