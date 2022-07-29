name := "Pokedex"

version := "0.1"

scalaVersion := "3.1.3"

val circeVersion = "0.7.0"

libraryDependencies ++= Seq(
  "io.spray" %%  "spray-json" % "1.3.6",
  "com.squareup.okhttp3" % "okhttp" % "4.10.0",
  "io.monix" %% "monix-execution" % "3.4.1",
  "io.monix" %% "monix-eval" % "3.4.1",
  "org.scalactic" %% "scalactic" % "3.2.12",
  "org.scalatest" %% "scalatest" % "3.2.12" % "test",
  "org.json4s" %% "json4s-core" % "4.0.5",
  "org.json4s" %% "json4s-jackson" % "4.0.5",
  "com.lihaoyi" %% "upickle" % "2.0.0",
  "io.circe"  %% "circe-core"     % "0.14.2",
  "io.circe"  %% "circe-generic"  % "0.14.2",
  "io.circe"  %% "circe-parser"   % "0.14.2"
)