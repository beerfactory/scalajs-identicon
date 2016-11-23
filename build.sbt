name := "scalajs-identicon root project"

scalaVersion := "2.12.0"

lazy val root = project.in(file(".")).
  aggregate(identiconJS, identiconJVM).
  settings(
    publish := {},
    publishLocal := {}
  )

lazy val identicon = crossProject.in(file(".")).
  settings(
    name := "scalajs-identicon",
    version := "0.1-SNAPSHOT"
  ).
  jvmSettings(
    // Add JVM-specific settings here
  ).
  jsSettings(
    // Add JS-specific settings here
  )

lazy val identiconJVM = identicon.jvm
lazy val identiconJS = identicon.js