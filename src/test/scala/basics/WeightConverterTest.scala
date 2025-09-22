package basics

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class WeightConverterTest extends AnyFunSuite with Matchers {
  test("convertInLb_KGconvertToLB_showCorrectLB") {
    val converter = WeightConverter(Seq(50.0, 100.0))

    // couldn't figure out how to handle floating-point precision issue
    // found this: https://stackoverflow.com/questions/11106886/scala-doubles-and-precision
    // but it needs to modify production code, I don't like that
    converter.convertInLb shouldBe Seq(110.00000000000001, 220.00000000000003)
  }

  test("afterWeightLoss_subtractWeightLoss_showNewWeight") {
    val converter = WeightConverter(Seq(80.0))
    val afterLoss = converter.afterWeightLoss(5.0)

    afterLoss.weightInKg shouldBe Seq(75.0)
  }
}
