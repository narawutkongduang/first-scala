package fs2

import fs2.Stream
import fs2.io.file.{Files, Path}
import cats.effect.{IO, IOApp}

object File extends IOApp.Simple {
  def run: IO[Unit] = {
    val filePath = Path("fileWithError.txt")

    Files[IO]
      .readUtf8Lines(filePath)
      .map(_.toUpperCase)
      .filter(_.contains("ERROR"))
      .compile.toList
      .flatMap(results => IO.println(results))
  }
}
