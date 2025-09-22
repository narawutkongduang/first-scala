ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

val Http4sVersion = "1.0.0-M29"
val MunitVersion = "0.7.29"
val LogbackVersion = "1.2.6"
val MunitCatsEffectVersion = "1.0.6"

lazy val root = (project in file("."))
  .settings(
    name := "first-scala",
    libraryDependencies += "co.fs2" %% "fs2-core" % "3.12.0",
    libraryDependencies += "co.fs2" %% "fs2-io" % "3.12.0",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test,

    libraryDependencies += "org.http4s"      %% "http4s-ember-server" % Http4sVersion,
    libraryDependencies += "org.http4s"      %% "http4s-ember-client" % Http4sVersion,
    libraryDependencies += "org.http4s"      %% "http4s-circe"        % Http4sVersion,
    libraryDependencies += "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
    libraryDependencies += "org.scalameta"   %% "munit"               % MunitVersion           % Test,
    libraryDependencies += "org.typelevel"   %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test,
    libraryDependencies += "ch.qos.logback"  %  "logback-classic"     % LogbackVersion,
  )

