name := "sbt-middleman"

organization := "com.joescii"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.4"

resolvers += "rubygems-release" at "http://rubygems-proxy.torquebox.org/releases"

libraryDependencies ++= Seq(
  "rubygems" % "jruby-pageant" % "[0,)",
  "rubygems" % "middleman" % "[3.3.7,)" excludeAll(ExclusionRule("rubygems", "ffi")),
  "rubygems" % "ffi" % "1.9.3" force(),
  "rubygems" % "tilt" % "1.4.1" force(),
  "rubygems" % "jquery-middleman" % "[3.0.4,)",
  "rubygems" % "middleman-blog" % "[3.5.3,)",
  "rubygems" % "middleman-s3_sync" % "[3.0.35,)",
  "rubygems" % "middleman-cloudfront" % "[0.1.0,)",
  "rubygems" % "middleman-autoprefixer" % "[2.3.0,)",
  "rubygems" % "middleman-s3_redirect" % "[3.0.5,)",
  "rubygems" % "dotenv" % "[1.0.2,)",
  "rubygems" % "minitest" % "5.4.3" force(),
  "rubygems" % "activesupport" % "4.1.7" force(),
  "rubygems" % "autoprefixer-rails" % "[4.0.0,)",
  "rubygems" % "pry" % "[0,)",
  "rubygems" % "chunky_png" % "1.3.2" force(),
  "rubygems" % "sass" % "3.4.6" force(),
  "rubygems" % "json" % "[1.7.7,)",
  "rubygems" % "therubyrhino" % "[0,)"
)

scalacOptions <<= scalaVersion map { v: String =>
  val opts = "-deprecation" :: "-unchecked" :: Nil
  if (v.startsWith("2.9.")) opts else opts ++ ("-feature" :: "-language:postfixOps" :: Nil)
}

