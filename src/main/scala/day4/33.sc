import day4.X.Tapper

Seq(1, 2, 3)
  .view
  .map(_ + 1)
  .tap("map")
  .filter(_ > 1)
  .tap("filter0")
  .filter(_ > 1)
  .force
  .tap("filter")


