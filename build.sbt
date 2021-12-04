name := "ScalaSimpleSamples"

version := "0.1"

scalaVersion := "2.13.7"
val akkaHttpVersion = "10.1.11"
val akkaVersion = "2.5.26"

libraryDependencies ++= Seq(
  "net.liftweb" %% "lift-json" % "3.4.2",
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
)
