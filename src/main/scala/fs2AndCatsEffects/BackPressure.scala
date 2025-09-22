package fs2AndCatsEffects

import cats.effect.{IO, IOApp}
import fs2.Stream

import scala.concurrent.duration.*
import scala.language.postfixOps

object BackPressure extends IOApp.Simple {
  def run: IO[Unit] = {
    //when using a List (1 to 1_000_000).toList) creates instantly in memory for all elements!
    Stream.range(1, 1_000_000) //  --> basically lazy load ony by one and only when needed
      .filter(_ % 2 == 0) // just for the understanding for "only when needed" part
      .evalMap(item => // Can perform side effects, async operations, error handling + Effects are executed one at a time in order
        IO.sleep(100.millis) >> // simulate network call
        IO(slowProcess(item * 10))) // multiply by 10 to show it's pure side effects and no computation
      .compile.drain // THROWS AWAY all values, keeps only side effects!
  }

  private def slowProcess(item: Int): Unit = {
    println(s"Processing item: $item")
    Thread.sleep(10) // simulate operations time
  }
}
