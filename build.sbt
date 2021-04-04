import sbt.Keys.{libraryDependencies, _}

// If you edit it then in sbt type 'reload' and 'update'

// scoverage
resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamual/sbt-plugins/"))(Resolver.ivyStylePatterns)

// Multi project build file.  For val xxx = project, xxx is the name of the project and base dir
lazy val commonSettings = Seq(
	organization := "org.sackfix",
	version := "0.1.3",
	scalaVersion := "2.13.5",
	libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.6" % "test",
	libraryDependencies += "com.typesafe" % "config" % "1.4.1",
//	coverageEnabled := true
  // Configuring publish to Sonartype, http://www.scala-sbt.org/release/docs/Using-Sonatype.html
	// ie at https://github.com/sbt/sbt-pgp#sbt-pgp
//  useGpg := true,
  pomIncludeRepository := { _ => false },
  licenses := Seq("MIT License" -> url("http://www.opensource.org/licenses/mit-license.php")),
  homepage := Some(url("http://www.sackfix.org/")),
  developers := List(
    Developer(id = "PendaRed",
      name  = "Jonathan Gibbons",
      email = "Jonathan@sackfix.org",
      url = url("http://www.sackfix.org"))
  ),
  publishMavenStyle := true,
  publishTo := {
    val nexus = "https://oss.sonatype.org/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases"  at nexus + "service/local/staging/deploy/maven2")
  },
  publishArtifact in Test := false
)

lazy val sackfixcommon = (project in file("./sackfix-common")).
	settings(commonSettings: _*).
	settings(
		name := "sackfix-common",
		// Configuring publish to Sonartype, http://www.scala-sbt.org/release/docs/Using-Sonatype.html
    description :="Common Fix fields, traits and utilities required by every part of SackFix",
		scmInfo := Some(
			ScmInfo(
				url("https://github.com/PendaRed/sackfix.git"),
				"scm:git@github.com:PendaRed/sackfix.git"
			)
		)
	)

lazy val sackfixcodegen = (project in file("./sackfix-codegen")).
	dependsOn(sackfixcommon).
	settings(commonSettings: _*).
	settings(
		name := "sackfix-codegen",
  	libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.3.0",
		libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
		libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "3.0.0"
	)

val sackfix = (project in file(".")).aggregate(sackfixcommon, sackfixcodegen)

