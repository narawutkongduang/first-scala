package fs2

object Streams extends App {

  val s0 = Stream.empty
  val s1 = Stream.emit(1)
   val s1a = Stream(1, 2, 3) // variadic

  println(s"s1a: $s1a")
  val s1b = Stream.emits(List(1, 2, 3)) // accepts any Seq


  println("\nActual stream contents:")
  println(s"s0 compiled: ${s0.compile.toList}")
  println(s"s1 compiled: ${s1.compile.toList}")
  println(s"s1a compiled: ${s1a.compile.toList}")
  println(s"s1b compiled: ${s1b.compile.toList}")
  
}
