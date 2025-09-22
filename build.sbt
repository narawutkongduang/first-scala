ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "first-scala",
    libraryDependencies += "co.fs2" %% "fs2-core" % "3.12.0",
    libraryDependencies += "co.fs2" %% "fs2-io" % "3.12.0",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test
  )

