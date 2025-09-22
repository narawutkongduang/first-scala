package basics

import scala.collection.mutable.ArrayBuffer

trait BasketBallPlayer {
  val name: String
}

object RunBasketBallPlayer extends App {
  val players = ArrayBuffer.empty[BasketBallPlayer]

  val pointGuard = PointGuard("Steph Curry")
  players.append(pointGuard)
  val powerForward = PowerForward("Kevin Durant")
  players.append(powerForward)
  players.foreach(player => println(player.name))
}
