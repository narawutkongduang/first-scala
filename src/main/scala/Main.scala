import scala.collection.mutable.ArrayBuffer

@main
def runApp(): Unit = {
  println("Hello, World!")

  Train.first()

  val firstClass = FirstClass("my first class")

  firstClass.blub()


  val firstInherit = new FirstInherit
  firstInherit.greet("blub")

  val iterator = IntIterator(3)
  println(iterator.next())
  println(iterator.hasNext) // wow. if no parameters required, means also no parentheses
  println(iterator.next())
  println(iterator.next())
  println(iterator.hasNext)
  println(iterator.next())


  val players = ArrayBuffer.empty[BasketBallPlayer]
  val pointGuard = PointGuard("Steph Curry")
  players.append(pointGuard)
  val powerForward = PowerForward("Kevin Durant")
  players.append(powerForward)
  players.foreach(player => println(player.name))

}