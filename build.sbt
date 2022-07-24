name := "Pokedex"

version := "0.1"

scalaVersion := "3.1.3"

libraryDependencies ++= Seq(
  "io.spray" %%  "spray-json" % "1.3.6",
  "com.squareup.okhttp3" % "okhttp" % "4.10.0",
  "io.monix" %% "monix-execution" % "3.4.1",
  "io.monix" %% "monix-eval" % "3.4.1",
  "org.scalactic" %% "scalactic" % "3.2.12",
  "org.scalatest" %% "scalatest" % "3.2.12" % "test",
  "com.google.guava" % "guava-rate-limiter" % "15.0-atlassian-1",
  "com.squareup.okhttp3" % "okhttp3" % "4.9.1",
  "com.google.guava" % "guava" % "31.0.1-jre"
)