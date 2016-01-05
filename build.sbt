lazy val root = (project in file(".")).
  settings(
    name := "ScalaSolutions",
    version := "1.0",
    scalaVersion := "2.10.4"
  )

libraryDependencies ++= Seq("org.scalatest" % "scalatest_2.10" % "2.0" % "test")

