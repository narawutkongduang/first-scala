package basics

case class WeightConverter(weightInKg: Seq[Double]):

  def convertInLb: Seq[Double] = weightInKg.map(_ * 2.2)

  def afterWeightLoss(lossInKg: Double): WeightConverter =
    WeightConverter(weightInKg.map(_ - lossInKg))

end WeightConverter

object RunWeightConverter extends App {
  val kilos = Seq(70.2, 80.6, 54.2, 77.0)

  println("\nWeights in LB:")
  println(WeightConverter(kilos).convertInLb)

  val tracker = WeightConverter(kilos)
  println("\nAfter losing 5kg: ")
  println(tracker.afterWeightLoss(5.0).convertInLb)
}