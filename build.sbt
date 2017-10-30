lazy val root = (project in file("."))
  .settings(
    name         := "Scala.js React boilerplate",
    scalaVersion := "2.12.3",
    version      := "0.0.2"
  )
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.3"
)

//npmDependencies in Compile ++= Seq(
//    "react" -> "15.6.1",
//    "react-dom" -> "15.6.1")
