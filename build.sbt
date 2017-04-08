import sbt.Keys.{libraryDependencies, _}

// If you edit it then in sbt type 'reload' and 'update'

// scoverage
resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamual/sbt-plugins/"))(Resolver.ivyStylePatterns)

// Multi project build file.  For val xxx = project, xxx is the name of the project and base dir
lazy val commonSettings = Seq(
	organization := "org.sackfix",
	version := "0.1.0",
	scalaVersion := "2.11.7",
	libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test",
	libraryDependencies += "com.typesafe" % "config" % "1.3.0"
//	coverageEnabled := true
)

lazy val sackfixcommon = (project in file("./sackfix-common")).
	settings(commonSettings: _*).
	settings(
		name := "sackfix-common"
	)

lazy val sackfixcodegen = (project in file("./sackfix-codegen")).
	dependsOn(sackfixcommon).
	settings(commonSettings: _*).
	settings(
		name := "sackfix-codegen",
  	libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.3",
		libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.3",
		libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "1.0.1"
	)

val sackfix = (project in file(".")).aggregate(sackfixcommon, sackfixcodegen)

