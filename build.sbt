name := """www-esamir"""

exportJars := true

version := "1.0-SNAPSHOT"


scalaVersion := "2.11.1"

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)

TwirlKeys.templateImports += "controllers.Prismic._"

libraryDependencies += "io.prismic" % "java-kit" % "1.1.1"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.7"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.7"

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.3.2"

libraryDependencies += "com.google.guava" % "guava" % "18.0"

libraryDependencies += "com.google.code.gson" % "gson" % "2.2.4"

libraryDependencies += "rome" % "rome" % "1.0"

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.3.2"


lazy val root = (project in file(".")).enablePlugins(PlayJava)

