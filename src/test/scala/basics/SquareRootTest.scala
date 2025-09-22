package basics

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SquareRootTest extends AnyFunSuite with Matchers {
  test("createSquareRoot_calculate_showCorrectFloatingNumber") {
    val sqrtFunction = basics.createSquareRoot()

    sqrtFunction(25) shouldBe 5.0
    sqrtFunction(16) shouldBe 4.0
    sqrtFunction(9) shouldBe 3.0
    sqrtFunction(77) shouldBe 8.774964387392123
  }

}
