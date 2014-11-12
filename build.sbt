name := "sbt-dependency-range"

organization := "com.joescii"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.4"

resolvers += "rubygems-release" at "http://rubygems-proxy.torquebox.org/releases"

libraryDependencies ++= Seq(
  "rubygems" % "middleman" % "3.3.7"
)

scalacOptions <<= scalaVersion map { v: String =>
  val opts = "-deprecation" :: "-unchecked" :: Nil
  if (v.startsWith("2.9.")) opts else opts ++ ("-feature" :: "-language:postfixOps" :: Nil)
}

