import sbt._
import Keys._

object BuildSettings {
  val buildOrganization = "com.github.slack-scala-client"
  val buildVersion      = "0.2.7"
  val buildScalaVersion = "2.11.12"
  val buildCrossScalaVersions = Seq("2.11.12", "2.12.7")

  val settings = Seq (
    organization       := buildOrganization,
    version            := buildVersion,
    scalaVersion       := buildScalaVersion,
    crossScalaVersions := buildCrossScalaVersions
  )
}

object Dependencies {
  val akkaVersion = "2.5.22"
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaHttp = "com.typesafe.akka" %% "akka-http-core" % "10.1.7"
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % akkaVersion

  val scalaAsync = "org.scala-lang.modules" %% "scala-async" % "0.9.7"
  val playJson = "com.typesafe.play" %% "play-json" % "2.7.1"

  val scalatest = "org.scalatest" %% "scalatest" % "3.0.5" % "test"

  val jodaConvert = "org.joda" % "joda-convert" % "1.8.1" // https://stackoverflow.com/a/13856382/118587

  val akkaDependencies = Seq(akkaHttp, akkaActor, akkaStream)
  val miscDependencies = Seq(playJson, scalaAsync, jodaConvert)
  val testDependencies = Seq(scalatest)

  val allDependencies = akkaDependencies ++ miscDependencies ++ testDependencies
}
