package basics

def createSquareRoot(): Int => Double = {
  (number: Int) => Math.sqrt(number)
}

object RunReturnFunction extends App {
  val squareRoot = createSquareRoot()

  println("Square root of 25: " + squareRoot(25))
  println("Square root of 16: " +  squareRoot(16))
  println("Square root of 9: " + squareRoot(9))
  println("Square root of 77: " + squareRoot(77))
}