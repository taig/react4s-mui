enablePlugins( ScalaJSPlugin, ScalaJSBundlerPlugin )

crossScalaVersions :=
    "2.11.8" ::
    scalaVersion.value ::
    Nil

resolvers += Resolver.sonatypeRepo( "snapshots" )

libraryDependencies ++=
    "com.github.ahnfelt" %%% "react4s" % "0.6.2-SNAPSHOT" ::
    Nil

name := "react4s-mui"

npmDependencies in Compile ++=
    "material-ui" -> "0.17.1" ::
    "react" -> "15.4.2" ::
    "react-dom" -> "15.4.2" ::
    "react-tap-event-plugin" -> "2.0.1" ::
    Nil

organization := "io.taig"

enableReloadWorkflow := true

scalacOptions ++=
    "-deprecation" ::
    "-encoding" :: "UTF-8" ::
    "-feature" ::
    "-unchecked" ::
    "-Xlint" ::
    "-Yno-adapted-args" ::
    "-Ywarn-numeric-widen" ::
    "-Ywarn-value-discard" ::
    "-Ywarn-unused-import" ::
    Nil

scalaVersion := "2.12.1"