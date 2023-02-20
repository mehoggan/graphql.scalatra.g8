ScriptedPlugin.globalSettings

scriptedBufferLog := false

val javaVmArgs: List[String] = {
  import scala.collection.JavaConverters._
  java.lang.management.ManagementFactory.getRuntimeMXBean.getInputArguments.asScala.toList
}

lazy val root = (project in file(".")).
  settings(
    name := "Scalatra-Scala-Sangria g8 Template",
    test in Test := {
      val _ = (g8Test in Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m",
      "-XX:ReservedCodeCacheSize=128m", "-XX:MaxPermSize=256m", "-Xss2m",
      "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe",
      url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)
  )
