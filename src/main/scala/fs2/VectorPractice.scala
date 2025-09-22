package fs2

object VectorPractice extends App {
  val numbers = Vector(1, 2, 3, 4, 5)
  val empty = Vector.empty[Int]
  val range = Vector.range(1, 10)
  println(s"numbers: $numbers")
  println(s"empty: $empty")
  println(s"range: $range")

  val first = numbers(0)
  val middle = numbers(2)
  val last = numbers.last
  println(s"first: $first")
  println(s"middle: $middle")
  println(s"last: $last")


  val extended = numbers :+ 6
  println(s"extended: $extended")
  val prepended = 0 +: numbers
  println(s"prepended: $prepended")
  val updated = numbers.updated(2, 99)
  println(s"updated: $updated")


  val doubled = numbers.map(_ * 2)
  println(s"doubled: $doubled")
  val evens = numbers.filter(_ % 2 == 0)
  println(s"evens: $evens")
  val sum = numbers.reduce(_ + _)
  println(s"sum: $sum" )
  val vec2 = Vector(6, 7, 8)
  val combined = numbers ++ vec2
  println(s"combined: $combined")


  val list = numbers.toList
  val array = numbers.toArray
  println(s"list: $list")
  println(s"array: $array")


  // measure time complexity Vector vs. List
  val largeVector = Vector.range(1, 1000000)
  val largeList = List.range(1, 1000000)

  println(s"Vector size: ${largeVector.size}")
  println(s"List size: ${largeList.size}")

  // Access arbitrary element
  val index = 777776

  val startVector = System.nanoTime()
  val elementFromVector = largeVector(index)
  val vectorTime = System.nanoTime() - startVector

  val startList = System.nanoTime()
  val elementFromList = largeList(index)
  val listTime = System.nanoTime() - startList

  println(s"elementFromVector: $elementFromVector")
  println(s"elementFromList: $elementFromList")

  println(s"Vector access time: ${vectorTime} nano seconds")
  println(s"List access time: ${listTime} nano seconds")
  println(s"List was ${listTime / vectorTime.toDouble} times slower")

}
