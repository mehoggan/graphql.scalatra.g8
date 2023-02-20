val ScalatraVersion = "$scalatra_version$"

ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / organization := "$organization$"

scalacOptions ++= Seq("-deprecation", "-feature")

lazy val hello = (project in file("."))
  .settings(
    name := "$name$",
    description := "GraphQL server with akka-http and sangria and scalatra"
    version := "$version$",
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
      "com.h2database" % "h2" % "1.4.196",
      "com.typesafe.akka" %% "akka-http" % "10.0.10",
      "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.10",
      "com.typesafe.slick" %% "slick" % "3.2.1",
      "com.typesafe.slick" %% "slick-hikaricp" % "3.2.1",
      "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
      "org.eclipse.jetty" % "jetty-webapp" % "$jetty_version$" % "container",
      "org.sangria-graphql" %% "sangria" % "1.3.0",
      "org.sangria-graphql" %% "sangria-spray-json" % "1.0.0",
      "org.scalatest" %% "scalatest" % "3.0.4" % Test
      "org.scalatra" %% "scalatra" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
      "org.slf4j" % "slf4j-nop" % "1.6.6",
    ),
  )

Revolver.settings

enablePlugins(SbtTwirl)
enablePlugins(JettyPlugin)
