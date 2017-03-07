enablePlugins( ScalaJSPlugin, ScalaJSBundlerPlugin )

crossScalaVersions :=
    "2.11.8" ::
    scalaVersion.value ::
    Nil

resolvers += Resolver.sonatypeRepo( "snapshots" )

libraryDependencies ++=
    "com.github.ahnfelt" %%% "react4s" % "0.5-SNAPSHOT" ::
    Nil

name := "react4s-mui"

npmDependencies in Compile ++=
    "material-ui" -> "0.17.0" ::
    "react" -> "15.4.2" ::
    "react-dom" -> "15.4.2" ::
    "react-tap-event-plugin" -> "2.0.1" ::
    "expose-loader" -> "0.7.1" ::
    Nil

organization := "io.taig"

scalaVersion := "2.12.1"

webpackConfigFile := Some(baseDirectory.value / "webpack.config.js")