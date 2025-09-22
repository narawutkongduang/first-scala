package basics

class FirstClass(text: String) {

  def blub() : Unit = println(s"$text")

}

object RunFirstClass extends App {
  val firstClass = new FirstClass("my first class")
  firstClass.blub()
}