name := "sbt-scala"

val scalaVer = "2.13.3"

fork in (Compile, run) := true

val commonLib = Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.google.inject" % "guice" % "4.0",
  "org.scalactic" %% "scalactic" % "3.2.2",
  "org.scalatest" %% "scalatest" % "3.2.2" % Test,
  "org.scalamock" %% "scalamock" % "5.0.0" % Test
)

lazy val root = (project in file("."))
  .settings(
    scalaVersion := scalaVer,
    libraryDependencies ++= commonLib
  )
  .settings(StaticAnalysis.wartremover)
  .settings(Style.scalastyle)
  .settings(Coverage.scoverage)
  .enablePlugins(JavaAppPackaging)
