package fs2AndCatsEffects

import fs2.Stream

object BasicStreams extends App {

  val s0 = Stream.empty
  println(s"s0: $s0")

  val s1 = Stream.emit(1)
  println(s"s1: $s1")

  val s1a = Stream(1,2,3)
  println(s"s1a: $s1a")

  val s1b = Stream.emits(List(1,2,3))
  println(s"s1b: $s1b")

  val s0List = s0.compile.toList
  val s1List = s1.compile.toList
  val s1aList = s1a.compile.toList
  val s1bList = s1b.compile.toList

  println("\nSafe list variables:")
  println(s"s0List: $s0List")
  println(s"s1List: $s1List")
  println(s"s1aList: $s1aList")
  println(s"s1bList: $s1bList")

  println(s"\nReusing s1aList: ${s1aList.map(_ * 2)}")
  println(s"s1bList size: ${s1bList.size}")
  println(s"s1List head option: ${s1List.headOption}")
}