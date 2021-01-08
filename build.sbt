val versions = new {   
    val scala = "2.13.1"
    val dom = "1.1.0"
    val react = "1.7.7"
}

name := "Scala.js Tutorial"
scalaVersion := versions.scala

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % versions.dom,
    "com.github.japgolly.scalajs-react" %%% "core" % versions.react
)

npmDependencies in Compile ++= Seq(
    "react" -> "16.13.1",
    "react-dom" -> "16.13.1")


