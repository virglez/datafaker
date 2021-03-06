import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.fhuertas",
      scalaVersion := s"$scalaMinorVersion",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "datafaker",
    libraryDependencies ++= Seq(
      avro4s,
      scalaTest % Test,
      scalaCheck % Test

    )
  )
