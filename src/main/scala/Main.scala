import api.FirstscalaServer

import scala.collection.mutable.ArrayBuffer
import cats.effect.{IO, IOApp}


object Main extends IOApp.Simple:
  // Used http4s Giter8 Template quickstart: https://http4s.org/v1/docs/quickstart.html#giter8-template
  val run = FirstscalaServer.run[IO]
