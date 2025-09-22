package basics

trait Iterator[A]:
  def hasNext: Boolean
  def next(): A

class IntIterator(to: Int) extends Iterator[Int]:
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int =
    if hasNext then
      val t = current
      current += 1
      t
    else
      0

object RunIntIterator extends App {
  val iterator = IntIterator(3)
  println(iterator.next())
  println(iterator.hasNext) // wow, it's function store as a attribute, means also no parentheses
  println(iterator.next())
  println(iterator.next())
  println(iterator.hasNext)
  println(iterator.next())
}
