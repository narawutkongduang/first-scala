@main
def runApp(): Unit = {
  println("Hello, World!")

  Train.first()

  val firstClass = FirstClass("my first class")

  firstClass.blub()

  
  val firstInherit = new FirstInherit
  firstInherit.greet("blub")

}