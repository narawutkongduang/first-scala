package com.nara.firstscala

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple:
  val run = FirstscalaServer.run[IO]
