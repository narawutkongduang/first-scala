package basics

object Train extends App {
  def first(): Unit = {
    println("I am wow")

    val addSeven = (x: Int) => x + 7
    println(addSeven(4))

    val square = (x: Int) => x * x
    println(square(8))

    val sum = (x: Int, y: Int) => x + y
    println(sum(5,7))

    val numbers = List(1, 2, 3, 4)
    val sum3 = numbers.reduce(_ + _)

    val addUnderscore: (Int, Int) => Int = _ + _
    println(addUnderscore(17, 44))

    val addUnderscoreTriplet: (Int, Int, Int) => Int = _ + _ + _
    println(addUnderscoreTriplet(10, 20, 30))

    val multiplyUnderscoreTriplet: (Int, Int, Int) => Int = _ * _ * _
    println(multiplyUnderscoreTriplet(10, 20, 30))
  }

  Train.first()
  
}
